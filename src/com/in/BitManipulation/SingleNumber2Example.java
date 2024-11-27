//137: https://leetcode.com/problems/single-number-ii/description/
package com.in.BitManipulation;

public class SingleNumber2Example {

	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		System.out.println("The ans is:>>> "+singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int result = 0;
		
		for(int i = 0 ; i < 32; i++) {
			int bitCount = 0;
			
			//Count how many numbers have the i-th bit set
			for(int num:nums) {
				bitCount = bitCount + ((num>>i)&1);
				//System.out.println("Value: for right shift is>>>"+((num>>i)&1));
				//System.out.println("bitCount : "+ bitCount);
			}	
			if(bitCount%3 != 0) {
				result = result | (1<<i);//Helps to set i-th bit in the result;
				//System.out.println("Result: "+result);
			}
		}
		return result;
	}

}
