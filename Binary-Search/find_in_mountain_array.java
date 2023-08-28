public class find_in_mountain_array {
    int find_peak(int arr[]){  // returns index of peak element
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                //decreasing array
                end=mid;
            }
            else{
                start=mid+1; //Ascending array
            }
        }
        return start;
    }
    int asc_bin_Search(int arr[],int target,int peak){
        int start=0;
        int end=peak;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    int des_bin_Search(int arr[],int target,int peak){
        int start=peak+1;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    int find(int arr[],int target){
        int peak_index=find_peak(arr);
        int ans;
        ans=asc_bin_Search(arr,target,peak_index);
        if(ans==-1){
            ans=des_bin_Search(arr,target,peak_index);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,8,6,2};
        find_in_mountain_array ob=new find_in_mountain_array();
        System.out.println(ob.find(arr,2));

    }
}
