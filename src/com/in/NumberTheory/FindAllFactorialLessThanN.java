//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

package com.in.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllFactorialLessThanN {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		ArrayList<Long> arrList = new ArrayList<>();
		
		arrList = findFactorials(num);
		System.out.println(arrList);
	}
	public static ArrayList<Long> findFactorials(int N) {
        ArrayList<Long> list = new ArrayList<>();
        long fact = 1;
        int i = 1;

        while (fact <= N) {
            list.add(fact);
            i++;
            fact *= i;
        }

        return list;
    }

}
