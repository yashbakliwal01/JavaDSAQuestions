package com.in.Recursion;

// 342: https://leetcode.com/problems/power-of-four/
import java.util.Scanner;

public class PowerOfFour {
	

	    public static boolean isPowerOfFour(int n) {
	      //  return n > 0 && (n & (n-1))==0 && ((n-1)%3==0);
	   
	   //Iterative approach
	    // if(n<=0){
	    //     return false;
	    // }
	    // while(n%4==0){
	    //     n = n/4;
	    // }
	    // return n==1;

	    //Recursive Approach
	    if(n<=0){
	        return false;
	    }
	    if(n==1){
	        return  true;
	    }
	    if(n%4==1 || n%4==2 || n%4==3){
	        return false;
	    }
	    return isPowerOfFour(n/4);

	    }
	    public static void main(String[] args){
	        Scanner scn = new Scanner(System.in);
	        int a = scn.nextInt();
	        boolean result = isPowerOfFour(a);
	        System.out.println(result);
	    }
	}