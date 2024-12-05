package com.in.NumberTheory;

import java.util.Scanner;

public class NumberOfCommonFactors {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int resultOfCount = numOfCommonFactor(a,b);
		System.out.println(resultOfCount);
	}
//12  6
	private static int numOfCommonFactor(int a, int b) {
//		int n;
		int count =0;
//		if(a>b)
//			n=b;
//		else
//			n=a;
		for(int i =1; i<=Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				count++;
			}
		}
		return count;
	}

}
