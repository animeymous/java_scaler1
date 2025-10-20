package Day_10;

import java.util.Scanner;

public class Max_and_Min_of_an_Array {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void minMax(int [] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Min "+min+" Max "+max);
    }
    public void max_and_Min_of_an_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        minMax(arr);

    }
}

/*
Problem Description

Take input an array A of size N and write a program to print maximum and minimum elements of the input.
The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints

1 <= N <= 1000
1 <= A <= 1000

Input Format
The first line contains a single integer N representing the length of the array A followed by N elements of the array A.

Output Format

A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.

There is **no space** after the minimum value in the output format.
There is only a **single space** between the maximum and minimum value.
*/
