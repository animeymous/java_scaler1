package Day_10;

import java.util.Scanner;

public class Pair_Count {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void printNumberOfPairs(int [] arr, int value){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] + arr[j] == value){
                    count++;
                }
            }
        }

        System.out.println("Pair count "+count);
    }
    public void pair_Count(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);

        System.out.println("Please provide number");
        int value = sc.nextInt();
        printNumberOfPairs(arr, value);
    }
}

/*
Problem Description

You are given an integer array A and an integer B.
You are required to return the count of pairs having sum equal to B.
NOTE: pair (i,j) and (j,i) are same.

Problem Constraints

1 <= A.size() <= 10000
1 <= A[i] <= 10000
1 <= B <= 10000

Input Format

First argument is an integer array A.
Second argument is an integer B.

Output Format
You have to return an integer representing count of required pairs.
*/
