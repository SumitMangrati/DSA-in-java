import java.util.Arrays;

public class starting_and_ending_position {
    public int[]searchRange(int nums[],int target){
        int ans[]={-1,-1};
        ans[0]= search(nums,target,true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public int search(int []nums,int target,boolean findstartIndex){
        //apply binary search
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;
             if(target<nums[mid]){
                end=mid-1;

            }
            else if(target > nums[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if(findstartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
             }
        }
        return ans;
    }


    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        starting_and_ending_position ob=new starting_and_ending_position();
        int ans[]=ob.searchRange(nums,8);
        System.out.println(Arrays.toString(ans));
    }
}
