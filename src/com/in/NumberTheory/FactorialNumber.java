//https://www.geeksforgeeks.org/problems/factorial-number2446/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
package com.in.NumberTheory;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int ans = factorial(num);
		System.out.println(ans);
	}

	private static int factorial(int num) {
		int fact =1;
		int i=1;
		while(i<=num) {
			fact *=i;
			i++;
			if(fact == num) {
				return 1;
			}
		}
		return fact;
	}

}
