public class Rotation_count {
    //Rotation count=pivot_index+1;
    public static int count(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //Case 1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //case2:
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return (mid - 1);
            }
            //if elements at start,mid,end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //check if start is the pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check if end is pivot
                if (arr[end] < arr[end - 1]) {

                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int ans=count(arr)+1;
        System.out.println(ans);
    }
}
