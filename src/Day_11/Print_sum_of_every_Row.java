package Day_11;

import java.util.Scanner;

public class Print_sum_of_every_Row {
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

    //print sum of every row
    public void printSumOfEveryRow(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            int sumOfEveryRow = 0;

            for(int col = 0; col < arr[0].length; col++){
                sumOfEveryRow += arr[row][col];
            }
            System.out.println("Sum "+sumOfEveryRow);
            System.out.println();
        }
    }
    public void print_sum_of_every_Row(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        printSumOfEveryRow(arr);
    }
}

/*
Problem Description
Write a program to input an N X M matrix A from user and print sum of every row.

Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= A[i][j] <= 10000

Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix A.

Output Format
Print sum of each row space separated.
*/
