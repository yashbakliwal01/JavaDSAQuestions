package com.in.Recursion_BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {
	public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2, int i, int j) {
        List<Integer> result = new ArrayList<>();
        //condition where list1 remaining elements
        if(i==list1.size()){
            for(int k=j; j<list2.size(); k++){
                 result.add(list2.get(k));
                 return result;
            }
        }
    //condition where list2 remaining elements
        if(j ==  list2.size()){
            for(int p = i; p<list1.size(); p++){
                 result.add(list1.get(p));
                 return result;
            }
        }

        if (list1.get(i) < list2.get(j)) {
            result.add(list1.get(i));
            result.addAll(mergeTwoLists(list1, list2, i + 1, j));
        } else {
            result.add(list2.get(j));
            result.addAll(mergeTwoLists(list1, list2, i, j + 1));
        }

        return result;
	}
	
		public static void main(String[] args) {
			 List<Integer> list1 = new ArrayList<>(List.of(1,2,4));
		     List<Integer> list2 = new ArrayList<>(List.of(1,3,4));

		     List<Integer> result = mergeTwoLists(list1, list2, 0, 0);
		     System.out.println("Merged List: " + result);
		}

}
