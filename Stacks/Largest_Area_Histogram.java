package Stacklevel1;

import java.util.Arrays;
import java.util.Stack;

public class Largest_Area_Histogram {
    public static int solution(int [] a){
        int [] a1= nser(a);
        int [] a2=nsel(a);
        int [] area = new int[a.length];
        for(int i=0;i<a.length;i++){
            area[i]=a1[i]+a2[i];
        }
        return max(area);
    }
    private static int max(int [] a){
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    private static int [] nser(int a[]){
        Stack <Integer> stack = new Stack<>();
        int [] span = new int[a.length];
        span[a.length-1]=1;
        stack.push(a.length-1);
        for(int i = a.length-2 ; i>=0;i-- ){
            while(stack.size()!=0 && a[stack.peek()]>=a[i]){
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
        int a1[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            a1[i]=span[i]*a[i];
        }
        return a1;
    }
    private static int [] nsel (int a[]){
        Stack <Integer> stack = new Stack<>();
        int s[]=new int[a.length];
        s[0]=0;
        stack.push(0);
        for(int i=1;i<a.length;i++){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.size()==0){
                s[i]=i;
            }
            else {
                s[i]=i-stack.peek()-1;
            }
            stack.push(i);
        }
        int a1[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            a1[i]=s[i]*a[i];
        }
        return a1;
    }
    public static void main(String[] args) {
        int a[]={2,5,4,3,1,2};
        int b[]={2,4};
        int c[]={1,1};
        System.out.println(solution(c));
    }
}
