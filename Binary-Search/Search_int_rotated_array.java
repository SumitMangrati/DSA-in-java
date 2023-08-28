public class Search_int_rotated_array {
    static int find_pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //Case 1:
            if(mid < end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            //case2:
            else if(mid>start && arr[mid-1]>arr[mid]){
                return (mid-1);
            }
            //case 3
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            //case 4
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int bin_search(int[] arr, int target,int piv){
        int start=0;
        int end=piv;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }

    static int bin_search_second(int[] arr, int target,int piv){
        int start=piv+1;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }

   static  int search(int arr[],int target){
        int pivot_index=find_pivot(arr);
        int ans;
        ans=bin_search(arr,target,pivot_index);
        if(ans==-1){
            ans=bin_search_second(arr,target,pivot_index);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={5,7,8,9,1,3,4};
        int ans=search(arr,3);
        System.out.println(ans);
    }
}
