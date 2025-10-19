package Day_10;

import java.util.Scanner;

public class Print_in_Reverse {
    public void printArrayReverse(int [] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void print_in_Reverse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        printArrayReverse(arr);
    }
}

/*
Problem Description

Write a program to print the input array A of size N in reverse order where you have to take integer
N and further N elements as input from user.

Problem Constraints

1 <= N <= 1000
1 <= A <= 1000
Input Format

A single line representing **N** followed by N integers of the array **A**
Output Format

A single line containing N space separated integers representing elements of the input array in reverse order.
**Note** - Keep a space character (' ') at the end of the line.
*/
