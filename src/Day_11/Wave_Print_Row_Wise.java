package Day_11;

import java.util.Scanner;

public class Wave_Print_Row_Wise {
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

    //print wave array row wise
    public void printWaveRowWise(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            if(row % 2 == 0){
                for(int col = 0; col < arr[0].length; col++){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for(int col = arr[0].length - 1; col >= 0; col--){
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
    public void wave_Print_Row_Wise(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        printWaveRowWise(arr);
    }
}

/*
Problem Description

You are given an integer N and an N x N matrix.
Print all elements of the matrix in a row-wise wave traversal.
The traversal should look like this:

Start with the first row, traverse from left to right.
For the next row, traverse in the reverse direction of the previous row (so if the previous was left → right, now it’s right → left).
For the following row, switch the direction again.
Continue alternating the direction for every subsequent row until the last row is covered.

Problem Constraints
1 <= N <= 103
0 <= Mat[i][j] <= 109

Input Format

First line is an integer N
Next N lines contain N space separated integers representing the matrix Mat

Output Format
Print all elements of the matrix in a single line, separated by spaces,
following the row-wise wave traversal order.
Note: Ensure there is a space character (' ') at the end of the line.
*/
