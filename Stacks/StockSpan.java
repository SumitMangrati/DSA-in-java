package Stacklevel1;

import java.util.Stack;

//next greater element on the left
public class StockSpan {
    public static int[] solution(int [] a){
        int [] span= new int[a.length];
        Stack <Integer> st= new Stack<>();
        span[0]=1;
        st.push(a[0]);
        for(int i = 1;i <a.length ;i++){
            while(st.size()!=0 && a[i]>=a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {

    }

}
