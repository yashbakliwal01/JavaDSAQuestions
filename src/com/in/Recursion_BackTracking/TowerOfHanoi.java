package com.in.Recursion_BackTracking;
// https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/
import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		towerOfHanoi(N, 'A', 'C', 'B');
			// source>> destination>> helper
	}

	private static void towerOfHanoi(int n, char source, char destination, char helper) {
		if(n==0) {//A  C B
			return;
		}
		
		towerOfHanoi(n-1, source, helper, destination);
		System.out.println("Move Disk "+n+" from source rod "+source+" to rod "+ destination);
		towerOfHanoi(n-1, helper, destination, source);
	}

}
