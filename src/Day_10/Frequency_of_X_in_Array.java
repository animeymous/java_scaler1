package Day_10;

import java.util.Scanner;

public class Frequency_of_X_in_Array {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void findFrequency(int [] arr, int x){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }

        System.out.println("Frequency of X "+count);
    }
    public void frequency_of_X_in_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        System.out.println("Please provide value to find frequency");
        int searchValue = sc.nextInt();
        findFrequency(arr, searchValue);

    }
}

/*
Problem Description
Given an integer array A (Array of bigInt). Find and return the frequency of number B in array A.

Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109

Input Format
The first argument is a bigInt array A.
The second argument is an integer B.

Output Format
Return the frequency of B in the array A.
*/
