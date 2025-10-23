package Day_11;

import java.util.Scanner;

public class Are_Matrices_Same {
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

    //function to check if 2 matrix same or not
    public void matrixSame(int [][] arr1, int [][] arr2){
        boolean sameMatrix = true;
        for(int row = 0; row < arr1.length; row++){
            for(int col = 0; col < arr1[0].length; col++){
                if(arr1[row][col] != arr2[row][col]){
                    sameMatrix = false;
                    break;
                }
            }
        }

        if(sameMatrix){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
    public void are_Matrices_Same(){
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
        matrixSame(arr1, arr2);
    }
}

/*
Problem Description

You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.
NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.

Problem Constraints

1 <= A.size(), B.size() <= 1000
1 <= A[i].size(), B[i].size() <= 1000
1 <= A[i][j], B[i][j] <= 1000
A.size() == B.size()
A[i].size() == B[i].size()

Input Format
First argument is 2-D array of integers representing matrix A.
Second argument is 2-D array of integers representing matrix B.

Output Format
Return 1 if both matrices are equal or return 0.
*/
