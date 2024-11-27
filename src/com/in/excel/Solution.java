package com.in.excel;

import java.util.Arrays;

public class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        // Build prefix XOR array
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] ^ arr[i];
        }

        int[] XORArr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if (start > 0) {
                XORArr[i] = arr[end] ^ arr[start - 1];
            } else {
                XORArr[i] = arr[end];
            }
        }
        return XORArr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1}, {1,2},{0,3},{3,3}};

        int[] result = solution.xorQueries(arr, queries);

        System.out.println("XOR results for each query: " + Arrays.toString(result));
    }
}
