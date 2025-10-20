package Day_10;

import java.util.Scanner;

public class Check_if_Array_is_Sorted {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void checkSortedAurNot(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                continue;
            }else{
                System.out.println("Array Not sorted");
                return;
            }
        }
        System.out.println("Array sorted");
    }
    public void check_if_Array_is_Sorted(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        checkSortedAurNot(arr);

    }
}

/*
Problem Description
Given an array A, check if it is sorted in non-decreasing order or not.
Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.

Problem Constraints
1 <= Ai <= 109
1 <= |A| <= 105

Input Format
The first and only argument contains an integer array A.

Output Format
Return 1 if array is sorted else return 0.
*/