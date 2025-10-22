package Day_11;

import java.util.Scanner;

public class Wave_Print_Column_Wise {
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

    //print 2D wave array column wise
    public void printWaveColumnWise(int [][] arr){
        for(int col = 0; col < arr[0].length; col++){
            //print top to down
            if(col % 2 == 0){
                for(int row = 0; row < arr.length; row++){
                    System.out.print(arr[row][col]+ " ");
                }
            }else{
                //print down to top
                for(int row = arr.length - 1; row >= 0; row--){
                    System.out.print(arr[row][col]+" ");
                }
            }

            System.out.println();
        }
    }
    public void wave_Print_Column_Wise(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        printWaveColumnWise(arr);
    }
}

/*
Problem Description
Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)
See example for clarifications regarding wave print.
Note: Ensure there is a space character (' ') at the end of the line.

Problem Constraints
1 <= N <= 103
0 <= Mat[i][j] <= 109

Input Format
First line is an integer N
Next N lines contain N space separated integers representing the matrix Mat

Output Format
A single line containing N*N integers of matrix Mat in wave form (column wise)
*/
