package com.in.Binary_Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Allocation_Of_Books {
    public static int books(ArrayList<Integer> A, int B) {
        
        if(B>A.size()){
            return -1;
        }
        
        int low = Collections.max(A);
        int sum = 0;
        
        for(int pages: A){
            sum += pages;
        }
        
        int high = sum;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)>>>1;//(low+high)/2;
            if(isValid(A,B,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1; 
            }
        }
        return ans;
    }
    
    public static boolean isValid(ArrayList<Integer> A, int B, int x){
        int sum = 0; 
        int i = 0; 
        int student =1;
        while(i<A.size()){
            
            if(sum + A.get(i)>x){
                student++;
                sum = A.get(i);
                if(student>B){
                    return false;
                }
            }else{
                sum = sum + A.get(i);
            }
            i++;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of Books in Library: ");
        int num = scn.nextInt();
        System.out.println("Pages of each book are: ");
        for(int i =0; i<num; i++){
            int values = scn.nextInt();
            arr.add(values);
        }
        System.out.println("Students number: ");
        int B=scn.nextInt();
        System.out.println("Minimizing the maximum number of pages read by students: "+books(arr,B));
    }
}
