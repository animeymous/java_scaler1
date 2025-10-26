package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix_Transpose {
    //inserting values in 2D array
    public List<List<Integer>> insertValues(List<List<Integer>> arr, int N, int M){
        Scanner sc = new Scanner(System.in);

        for(int j = 0; j < N; j++){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < M; i++){
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }

        return arr;
    }

    //function to transpose matrix
    public void transposeMatrix(List<List<Integer>> arr, int N, int M){
        int [][] newArr = new int[N][M];

        //reading column wise
        for(int col = 0; col < M; col++){
            for(int row = 0; row < N; row++){
                //entering values column wise
                newArr[col][row] = arr.get(row).get(col);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void matrix_Transpose(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Please provide value in separate line for array");

        arr = insertValues(arr, N, M);
        transposeMatrix(arr,N,M);
    }
}

/*
Problem Description
Given a 2D integer array A, return the transpose of A.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000

Input Format
First argument is a 2D matrix of integers.

Output Format
You have to return the Transpose of this 2D matrix.
*/