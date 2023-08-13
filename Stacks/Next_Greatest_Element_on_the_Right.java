package Stacklevel1;

import java.util.Stack;

public class Next_Greatest_Element_on_the_Right {
    public static void solution(int [] a){
        Stack <Integer> st= new Stack<>();
        for(int i = a.length-1; i >=0 ;i--){
            int number=a[i];
            while(st.size()!=0 && st.peek()<number){
                st.pop();
            }
            if(st.size()==0){
                System.out.println(number+" NGER = -1");
            }
            else{
                System.out.println(number+" NGER = "+st.peek());
            }
            st.push(number);
        }
    }
    public static void main(String[] args) {
        int [] a= {5,8,7,9,10};
        solution(a);
    }
}
