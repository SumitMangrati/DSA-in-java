public class peak_element_in_mountain_array {
    //array like mountain first increases then decreases so find the peak element
    /*
    we'll apply bin search  1.if arr[mid]>arr[mid+1]---> we are in the decreasing part of array
                              end=mid;

                            2. if arr(mid)<arr[mid+1]----> we are in the increasing part of array
                              start=mid+1
     */
    int peak(int arr[]){
         int start=0;
         int end=arr.length-1;
         while(start!=end){
             int mid=(start+end)/2;
             if(arr[mid]>arr[mid+1]){ //decreasing part
                 end=mid;
             } else {
                 start=mid+1;
             }
         }
         return arr[start];
    }
    public static void main(String[] args) {
            int arr[]={1,2,3,5,6,4,3,2};
            int b[]={2,3,6,8,9,11,13,7,5,4};
            peak_element_in_mountain_array ob=new peak_element_in_mountain_array();
            int ans1=ob.peak(arr);
            int ans2=ob.peak(b);
            System.out.println(ans1);
            System.out.println(ans2);
    }
}
