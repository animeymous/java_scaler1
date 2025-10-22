package Day_11;

import java.util.Scanner;

public class Add_the_matrices {
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

    //add the matrices
    public void addMetrices(int [][] arr1, int [][] arr2, int N, int M){
        int [][] newArr = new int[N][M];
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[0].length; col++){
                newArr[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        for(int i = 0; i < newArr.length; i++){
            for(int k = 0; k < newArr[0].length; k++){
                System.out.print(newArr[i][k]+" ");
            }
            System.out.println();
        }
    }
    public void add_the_matrices(){
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

        addMetrices(arr1, arr2, N, M);
    }
}

/*
Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
The Following will give you an idea of matrix addition:

Problem Constraints

1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
Input Format

The first argument is the 2D integer array A The second argument is the 2D integer array B
Output Format

You have to return a vector of vector of integers after doing required operations.
*/
