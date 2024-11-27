package com.in.searching;

import java.util.Scanner;

public class SqrtOfxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqrtOfxExample ans =  new SqrtOfxExample();
		Scanner scn = new Scanner(System.in);
		System.out.print("Num: ");
		int s = scn.nextInt();
		System.out.println("Solution: "+ans.mySqrt(s));
	}
	public static int mySqrt(int x) {
        int start = 1;
        int end = x;
       // int result = 0;
        while(start<=end){
           int mid = start + (end-start)/2;
           
           if(mid*mid <= x && (mid+1)*(mid+1)>x){
            return mid;
           }else if((long)mid * mid < x){
             start = mid +1;
           }else{
             end = mid -1;
           } 
        }
        return end+1;
    }
}
