package Day_11;

import java.util.Scanner;

public class Sum_of_Columns_of_2D_Array {
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

    //sum of each columns
    public void sumOfEachColumn(int [][] arr, int N, int M){
        int [] newArr = new int[M];

        for(int col = 0; col < arr[0].length; col++){
            int sum = 0;
            for(int row = 0; row < arr.length; row++){
                sum += arr[row][col];
            }
            newArr[col]= sum;
        }

        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
    public void sum_of_Columns_of_2D_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        int [][] arr = new int[N][M];
        System.out.println("Please provide value in separate line");

        arr = insertValues(arr);
        sumOfEachColumn(arr, N, M);
    }
}

/*
Problem Description
Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.

Problem Constraints

1 <= A,B <= 103
1 <= C[i][j] <= 103


Input Format

The first argument is a single integer A.
The second argument is a single integer B.
The third argument is a 2D integer array C.


Output Format
Return an integer array of size B that represents the sums of the columns of the 2D array C.
*/
