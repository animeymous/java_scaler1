package Day_10;

import java.util.Scanner;

public class Sum_the_Array {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void sum(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of array "+sum);
    }
    public void sum_the_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        sum(arr);
    }
}

/*
Problem Description

Write a program to print sum of elements of the input array A of size N.
Note: User is supposed to write a program from scratch to add the elements of the input array and print the result.
Note for Python learners: You don't need to write code for taking input. The input is already provided to you as function parameter.

Problem Constraints

1 <= N <= 1000
1 <= A <= 1000

Input Format

- The first integer N denotes the number of integers in the array.
- The next N integers denotes the element of the array A.

Output Format
A single integer containing sum of elements from the input array.
*/