package Day_11;

import java.util.Scanner;

public class Print_matrix_row_by_row {
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

    //printing values of 2D array row by row
    public void printArrays(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void print_matrix_row_by_row(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        printArrays(arr);
    }
}

/*
Problem Description
Given a matrix of N rows and M columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.

Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000

Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix Mat

Output Format
N lines denoting each row.
Note: Ensure there is a space character (' ') at the end of the line.
*/
