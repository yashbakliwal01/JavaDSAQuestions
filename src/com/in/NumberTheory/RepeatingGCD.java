package com.in.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class RepeatingGCD{
	 public static void main(String[] args) {
		 RepeatingGCD r = new RepeatingGCD();
	        long N = 2; // Example input
	        int x = 2;
	        int y = 3;

	        // Call FindGcd and print the result
	        String result = r.FindGcd(N, x, y);
	        System.out.println("GCD Result: " + result);
	    }
	 
  public String FindGcd(long N, int x, int y)
  {
      // Code here
      int ans = gcd(x,y);
      StringBuilder result = new StringBuilder();
      for(int i=0; i < ans; i++){
          result.append(N);
      }
      return String.valueOf(result);
      
  }
  
  public int gcd(int a, int b){
      if(b==0){
          return a;
      }
      return gcd(b, a % b);
      // 
  }
}