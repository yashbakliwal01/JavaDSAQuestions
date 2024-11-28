//https://www.geeksforgeeks.org/problems/product-of-factors-of-number4757/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

package com.in.NumberTheory;

import java.util.Scanner;

public class ProductOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int ans = factorProduct(num);
		System.out.println(ans);
	}

	private static int factorProduct(int N) {
		long modulo = 1000000007;
		long product = 1;
		for(int i =1; i*i<= N; i++) {
			if(N%i == 0) {
				if((N/i)==i) {
					product = (product * i) % modulo;
				}else {
					product = (product * i *(N/i)) % modulo;
				}
			}
		}
		return (int)product;
	}

}
