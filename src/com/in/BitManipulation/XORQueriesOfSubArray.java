//1310: https://leetcode.com/problems/xor-queries-of-a-subarray/description/

package com.in.BitManipulation;

import java.util.Arrays;

public class XORQueriesOfSubArray {

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
        XORQueriesOfSubArray xORQueriesOfSubArray = new XORQueriesOfSubArray();
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1}, {1,2},{0,3},{3,3}};

        int[] result = xORQueriesOfSubArray.xorQueries(arr, queries);

        System.out.println("XOR results for each query: " + Arrays.toString(result));
    }
}
