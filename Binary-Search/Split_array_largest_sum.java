public class Split_array_largest_sum {
    //array containing non-negative numbs and split the array into 'm' continuous sub-arrays such that to minimize the largest sum among these m sub-arrays
    /*
      first divide array into m sub-arrays and calculate sum for each m sub array and then its maximum sum
      now among all the largest sum return the smallest sum
     */
    public static int split_array(int nums[],int m){
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end=end+nums[i];
        }
        while(start<end){
            int mid=(start+end)/2;
            int sum=0;
            int pieces=1;
            //let's sum the array
            for(int num : nums){
                if(sum+num>mid){ //if sum exceeds the mid value then we need to put that element in new array
                    sum=num;
                    pieces++;
                }
                else{
                    sum=sum+num;
                }

            }
            if(pieces<=m){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int a[]={7,2,5,8,10};
        System.out.println(split_array(a,2));
    }
}
