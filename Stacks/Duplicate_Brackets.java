package Stacklevel1;

import java.util.Stack;

public class Duplicate_Brackets {
    public static boolean solution(String s){
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.peek()=='('){
                    return true;
                }
                else{
                    do{
                        st.pop();
                        //char check=  st.peek();
                    }while(st.peek()!='(');
                    st.pop();
                }
            }
            else{
                 st.push(s.charAt(i));
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String s1="((a+b)+(c+d))";
        String s2="(a+b)+((c+d))";
        String s3="((a+b))+((c+d)+e)";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }
}
