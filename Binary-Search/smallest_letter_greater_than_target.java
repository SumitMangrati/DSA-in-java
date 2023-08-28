public class smallest_letter_greater_than_target {
    //array of characters are sorted in decreasing order
    static  char as_bin_search(char a[], char target){
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;
        if(target>=a[a.length-1]){
            return ' ';
        }
        while(start<=end){
             if(target<a[mid]){
                end=mid-1;
                mid=(start+end)/2;
            }
            else if(target>=a[mid]){
                start=mid+1;
                mid=(start+end)/2;
            }
        }
        return a[start];
    }


    public static void main(String[] args) {
        char a[]={'c','f','j'};
        char target='j';
        char ans=as_bin_search(a,target);
        System.out.println(ans);
    }

}
