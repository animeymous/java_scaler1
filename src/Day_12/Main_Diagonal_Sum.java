package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Diagonal_Sum {
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

    //function to find main diagonal sum
    public void mainDiagonalSum(List<List<Integer>> arr){
        int sum = 0;

        for(int row = 0; row < arr.size(); row++){
            for(int col = 0; col < arr.get(row).size(); col++){
                if(row == col){
                    sum += arr.get(row).get(col);
                }
            }
        }

        System.out.println("Sum "+sum);
    }
    public void main_Diagonal_Sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Please provide value in separate line for array");

        arr = insertValues(arr, N, M);
        mainDiagonalSum(arr);
    }
}

/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

Problem Constraints
1 <= N <= 103
-1000 <= A[i][j] <= 1000

Input Format
There are 1 lines in the input. First 2 integers R, C are the number of rows and columns.
Then R * C integers follow corresponding to the rowwise numbers in the 2D array A.

Output Format
Return an integer denoting the sum of main diagonal elements.
*/
