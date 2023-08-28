import java.util.Arrays;

public class Sum_target_in_sorted_array {
    static int[] pair_sum(int a[],int target){
        int ans[]={-1,-1};
        int start=0;
        int end=a.length-1;
        while(start!=end){
            if((a[start]+a[end])==target){
                ans[0]=start;
                ans[1]=end;
                return  ans;
            }
            if((a[start]+a[end])<target){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,11,13,14,22};
        int ans[]=pair_sum(arr,17);
        System.out.println(Arrays.toString(ans));
    }
}
