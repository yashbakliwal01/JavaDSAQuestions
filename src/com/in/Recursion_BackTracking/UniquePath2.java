package com.in.Recursion_BackTracking;

public class UniquePath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		System.out.println(uniquePathsWithObstacles(grid));
	}
	
	public static int uniquePathsWithObstacles(int[][] grid){
        return countPaths(0, 0 ,grid);
    }
    public static int countPaths(int i, int j, int[][] grid) {  
       
        //outofbound or obstacle condition
        if(i>=grid.length || j>=grid[0].length ||grid[i][j]==1){
            return 0;
        }
        
        //Destination
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }

        int count = 0;
        //Option1: Moving to right side
        if(i<grid.length && j+1<=grid[0].length && grid[i][j]!=1){
            count += countPaths(i, j+1, grid);
        }
        

         //Option2: Moving down
         if(i+1<grid.length && j<=grid.length && grid[i][j]!=1){
            count += countPaths(i+1, j, grid);
         }
        

        return count;
    }
	
	

}
