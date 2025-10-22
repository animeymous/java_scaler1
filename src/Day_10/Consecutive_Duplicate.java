package Day_10;

import java.util.Scanner;

public class Consecutive_Duplicate {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void ifConsecutive(int [] arr){
        boolean ifConsecutive = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i + 1]){
                ifConsecutive = true;
                break;
            }
        }

        if(ifConsecutive){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public void consecutive_Duplicate(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        ifConsecutive(arr);
    }
}

/*
Problem Description

Write a function to check if the given array A has consecutive duplicate elements or not.
Return True if there are consecutive duplicate elements in the list else return False.
Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109

Input Format
An integer array A as the function argument.

Output Format
Return True or False
*/
