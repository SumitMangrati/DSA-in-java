public class position_in_infinite_array {


    static  int finding_range(int [] a, int target){
        //first lets find range
        //first start with size of 2
        int start=0;
        int end=1;

        //cond for target to lie in range---> start<=target<=end
        // keep doubling range, when target>end
        while(target>a[end]){
            int newStart=end+1;
            //new end= previous end + 2*size of box:
             end= end+ (end-start+1)*2;
             start=newStart;
        }
        return ascending_bin_search(a,target,start,end);
    }


    static  int ascending_bin_search(int a[], int element,int s,int e) {
        int mid = (s + e) / 2;
        while (s<=e ) {
            //check in middle element first
            if (a[mid] == element){
                return mid;
            }
            //greater func
            else if (element>a[mid]) {
                s=mid+1;
                mid=(s+e)/2;

            }
            else {
                e=mid-1;
                mid=(s+e)/2;
            }
        }
        return -1;
    }

    /*
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11,12,15,16,23,25,27,28,29,33,34,36,44,45,67,88,100,121,1411};
        int ans =finding_range(arr,121);
        System.out.println(ans);

    }

     */
}
