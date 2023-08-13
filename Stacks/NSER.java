package Stacklevel1;

import java.util.Arrays;
import java.util.Stack;

public class NSER {
    public static void main(String[] args) {
        int [] a={2,5,4,3,1,2};
        solution(a);
        spann(a);
    }
    public static void solution(int a[]){
        Stack<Integer> stack = new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            int number=a[i];
            while(stack.size()!=0 &&  number<stack.peek()){
                stack.pop();
            }
            if(stack.size()==0){
                System.out.println(number +"-->" + "-1");
            }
            else {
                System.out.println(number+"-->"+stack.peek());
            }
            stack.push(number);
        }
    }
    public static void spann(int [] a){
        Stack <Integer> stack = new Stack<>();
        int [] span = new int[a.length];
        span[a.length-1]=1;
        stack.push(a.length-1);
        for(int i = a.length-2 ; i>=0;i-- ){
            while(stack.size()!=0 && a[stack.peek()]>a[i]){
                stack.pop();
            }
            if(stack.size()==0){
                span[i]=a.length-i;
            }
            else{
                span[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
