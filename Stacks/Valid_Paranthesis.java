package Stacklevel1;

import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean solution(String s){
        Stack <Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'){
                while(st.size()!=0 && st.peek()!='('){
                    if(st.size()==0){
                        return false;
                    }
                    st.pop();
                }
                if(st.size()==0){
                    return false;
                }
                st.pop();
            }
            else if(ch=='}'){
                while(st.size()!=0 && st.peek()!='{'){
                    if(st.size()==0){
                        return false;
                    }
                    if(st.size()==0){
                        return false;
                    }
                    st.pop();
                }
                st.pop();
            }
            else if(ch==']'){
                while(st.size()!=0 && st.peek()!='[' ){
                    if(st.size()==0){
                        return false;
                    }
                    st.pop();
                }
                if(st.size()==0){
                    return false;
                }
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(solution("(){}[]"));
        System.out.println(solution("(]"));
        System.out.println(solution("[{}(){()}"));
    }
}
