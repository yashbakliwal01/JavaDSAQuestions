//81: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package com.in.Binary_Search;

public class SearchRotatedSortedArray2 {

	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean result = search(nums, target);
        System.out.println(result);
	}
	public static boolean search(int[] nums, int target) {
        // int low = 0;
        // int high = nums.length -1;
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(nums[mid]==target){
        //         return true;
        //     }
        // }
        // return false;

        for(int i =0; i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
