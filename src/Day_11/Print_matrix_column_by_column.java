package Day_11;

import java.util.Scanner;

public class Print_matrix_column_by_column {
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

    //function to print matrix column by column
    public void printMatrixColumn(int [][] arr, int N, int M){

        for(int col = 0; col < arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public void print_matrix_column_by_column(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        printMatrixColumn(arr, N, M);
    }
}

/*
Problem Description
Given a matrix of N rows and M columns, print it column by column. Firstly print 0th column, then 1st column, 2nd column and so on.
Note: Make sure to receive the matrix input row by row.

Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000

Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix Mat

Output Format
M lines denoting each column
Note: Ensure there is a space character (' ') at the end of the line.
*/
