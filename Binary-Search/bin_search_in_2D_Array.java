import java.util.Arrays;

public class bin_search_in_2D_Array {
    static int []bin_search(int arr[][],int target){
        int ans[]={-1,-1};
        int lb=0; //deals with rows
        int ub=arr.length-1; //deals with column
        while(lb< arr.length && ub>=0){
            if(target==arr[lb][ub]){ //case 1 found
                ans[0]=lb;
                ans[1]=ub;
                return ans;
            }
            else if(arr[lb][ub]<target){ //Case 2: row++
                lb++;
            }
            else{
                ub--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={
                {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}
        };
        int ans[]=bin_search(arr,28);
        System.out.println(Arrays.toString(ans));
    }
}
