package Day_11;

import java.util.Scanner;

public class Matrix_Subtraction {
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

    //function to calculate matrix subtraction
    public void calculateMatrixSubtraction(int [][] arr1, int [][] arr2, int N, int M){
        int [][] newArr = new int[N][M];
        int count = 0;
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[0].length; col++){
                newArr[row][col]= arr1[row][col] - arr2[row][col];
            }
            count++;
        }

        for(int i = 0; i < newArr.length; i++){
            for(int j = 0; j < newArr[0].length; j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void matrix_Subtraction(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr1 = new int[N][M];
        int [][] arr2 = new int[N][M];

        System.out.println("Please provide value in separate line for first array");

        arr1 = insertValues(arr1);

        System.out.println("Please provide value in separate line for second array");
        arr2 = insertValues(arr2);
        calculateMatrixSubtraction(arr1, arr2, N, M);
    }
}

/*
Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M).
You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions).
Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.

Problem Constraints
1 <= N, M <= 103
-109 <= A[i][j], B[i][j] <= 109

Input Format
The first argument is the 2D integer array A
The second argument is the 2D integer array B

Output Format
Return a 2D matrix denoting A - B.
*/
