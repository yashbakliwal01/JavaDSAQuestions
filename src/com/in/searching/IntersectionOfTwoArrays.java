package com.in.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		 int[] result = intersect(nums1, nums2);
		 
	        System.out.print("Intersection: ");
	        for(int num : result) {
	        	System.out.print(num + " ");
	        }
	        System.out.println();
	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		//int res = 0;
		List<Integer> list = new ArrayList<>();
		int i=0; int j=0;
		
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i]<nums2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
		int[] intersection = new int[list.size()];
		for(int m = 0; m < list.size();m++) {
			intersection[m] = list.get(m);
		}
		return intersection;
	}

}
