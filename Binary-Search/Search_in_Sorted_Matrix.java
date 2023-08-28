/*import java.util.Arrays;

public class Search_in_Sorted_Matrix {


    static int []search(int arr[][],int target) {
        int ans[] = {-1, -1};
        int rStart=0;
        int rEnd=arr.length-1;
        int rows = arr.length;
        int column = arr[0].length;
        int cMid=column/2;
        if(rows==1){
            return binary_search(arr,0,0,column-1,target);
        }
        //run the loop till 2 rows are remaining
        while(rStart< (rEnd-1)){  //while this condition is true it will have more than two rows
            int mid=(rStart+rEnd)/2;
            if(arr[mid][cMid]==target){
                return new int[] {mid, cMid};
            }
            else if(arr[mid][cMid]<target)
            {
                rStart=mid;
            }
            else {
                rEnd = mid;
            }
        }
    }

    static int[] binary_search(int[][] arr, int row, int cStart, int cEnd , int target){
        int []ans={-1,-1};
        while(cStart<=cEnd){
            int mid=(cStart+cEnd)/2;
            if (target == arr[row][mid]) {
                ans[0]=row;
                ans[1]=mid;
                return ans;
            }
            else if(target>mid){
                cStart=mid+1;
            }
            else {
                cEnd=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        int ans[]=bin_search(arr,11);
        System.out.println(Arrays.toString(ans));

    }
}

 */
