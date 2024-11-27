//540: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package com.in.Binary_Search;

public class SingleElementinSortedArrayExample {

	public static void main(String[] args) {
		int[] nums = {3, 3, 7, 7, 10, 11, 11};
        
        int result = singleNonDuplicate(nums);
        System.out.println("The single non-duplicate element is: " + result);
	}

	private static int singleNonDuplicate(int[] nums) {
		int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(mid==0){
                return mid;//0
            }else if(mid == nums.length -1){
                return mid;//n-1
            }

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return mid;//ans == mid
            }
            
            if(mid%2==0){
                //mid == even but has odd num. of elements as ODD
                if(nums[mid+1] == nums[mid]){//right
                    low = mid + 2;
                }else{
                    high = mid -1;
                }
            }else{
                //if mid is odd but num. of elements is EVEN
                if(nums[mid-1] == nums[mid]){//need to move right
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return nums[low];
	}
}
