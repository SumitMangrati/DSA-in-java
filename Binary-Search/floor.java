public class floor {
    static  int as_bin_search(int a[], int target){
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(a[mid]==target){
                return a[mid];
            }
            else if(target<a[mid]){
                end=mid-1;
                mid=(start+end)/2;
            }
            else{
                start=mid+1;
                mid=(start+end)/2;
            }
        }
        return a[end];
    }

    static  int des_bin_search(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (a[mid] == target) {
                return a[mid];
            } else if (target < a[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }


        return a[end];
    }


    static int order_angostic(int a[],int element){
        int len=a.length;
        if(a[0]<a[len-1]) //Ascending order:
        {
            return as_bin_search(a,element);
        }
        else{
            return des_bin_search(a,element);
        }
    }

    public static void main(String[] args) {
        int a[]={2,3,6,8,14,17,25,34};
        int target=7;
        int ans=order_angostic(a,target);
        System.out.println(ans);
    }
}


