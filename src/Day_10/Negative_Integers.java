package Day_10;

import java.util.Scanner;

public class Negative_Integers {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void printNegative(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
    public void negative_Integers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];

        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        printNegative(arr);
    }
}

/*
Problem Description

Write a program to print all negative numbers from input array A of size N. Take integer N and N elements of the array as input from user.

Problem Constraints

1 <= N <= 1000
-1000 <= A <= 1000
Input Format

A single line representing N followed by N integers of the array A
Output Format

A single line containing elements from the input array which are negative in the same order.
Note: Keep a space character (' ') at the end of the line.
*/
