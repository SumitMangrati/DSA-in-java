package Stacklevel1;

import java.util.Arrays;
import java.util.Stack;

public class NGEL {
    public static void main(String[] args) {
        int a[]={2,5,4,3,1,2};
        solution(a);
        span(a);
    }
    public static void solution(int a[]){
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<a.length;i++){
            int number=a[i];
            while(stack.size()!=0 && number>stack.peek()){
                stack.pop();
            }
            if(stack.size()==0){
                System.out.println(number+"-->-1");
            }
            else{
                System.out.println(number+"-->"+stack.peek());
            }
            stack.push(number);
        }
    }
    public static void span(int a[]){
        Stack<Integer>stack=new Stack<>();
        int [] s = new int[a.length];
        s[0]=1;
        stack.push(0);
        for (int i = 1; i<a.length;i++){
            //s[i]=1;

            while(stack.size()!=0 && a[stack.peek()]<a[i]){
                stack.pop();
            }
            if(stack.size()==0){
                s[i]=i+1;
            }
            else{
                s[i]=i-stack.peek();
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(s));
    }
}
