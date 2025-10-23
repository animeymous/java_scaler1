package Day_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest_in_each_Row_of_2D_Array {
    //inserting values in 2D array
    public int [][] insertValues(int [][] arr){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    //function to calculate largest in each row
    public void largestEachRow(int [][] arr, int N){
        int [] largestArr = new int[N];

        for(int row = 0; row < arr.length; row++){
            int largest = Integer.MIN_VALUE;
            for(int col = 0; col < arr[0].length; col++){
                if(arr[row][col] > largest){
                    largest = arr[row][col];
                }
            }
            largestArr[row] = largest;
        }

        for(int i = 0; i < largestArr.length; i++){
            System.out.print(largestArr[i]+" ");
        }
    }
    public void largest_in_each_Row_of_2D_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        largestEachRow(arr, N);
    }
}

/*
Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.

Problem Constraints
1 <= N, M <= 1000
1 <= Ai <= 109

Input Format
The first argument A is a 2D array of integers

Output Format
Return an array of length N, in which every index i contains the maximun value of the ith row in the 2D matrix.
*/
