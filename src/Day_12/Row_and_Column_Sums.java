package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Row_and_Column_Sums {
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

    //function to calculate rows and columns sums
    public void sumOfRowsAndCols(List<List<Integer>> arr){
        List<Integer> rowSum = new ArrayList<>();
        List<Integer> colSum = new ArrayList<>();

        //calculate row sum
        for(int row = 0; row < arr.size(); row++){
            int sum = 0;
            for(int col = 0; col < arr.get(0).size(); col++){
                sum +=  arr.get(row).get(col);
            }
            rowSum.add(sum);
        }

        //calculate col sum
        for(int col = 0; col < arr.get(0).size(); col++){
            int sum = 0;
            for(int row = 0; row < arr.size(); row++){
                sum += arr.get(row).get(col);
            }
            colSum.add(sum);
        }

        // print row and col sum
        for(int i = 0; i < rowSum.size(); i++){
            System.out.print(rowSum.get(i)+" ");
        }

        System.out.println();

        for(int i = 0; i < colSum.size(); i++){
            System.out.print(colSum.get(i)+" ");
        }
    }
    public void row_and_Column_Sums(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Please provide value in separate line for first array");

        arr = insertValues(arr, N, M);

        sumOfRowsAndCols(arr);
    }
}

/*
Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.

NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M),
where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000

Input Format
First argument is a 2D matrix of integers.

Output Format
You have to return a 1D list of integers after doing required operations.
*/
