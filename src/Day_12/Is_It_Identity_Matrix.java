package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Is_It_Identity_Matrix {
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

    //function to check identity matrix or not
    public int identityMatrix(List<List<Integer>> A){
        int N = A.size();

        // Check diagonal elements
        for (int i = 0; i < N; i++) {
            if (A.get(i).get(i) != 1) {
                return 0; // Not an identity matrix if any diagonal element is not 1
            }
        }

        // Check off-diagonal elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && A.get(i).get(j) != 0) {
                    return 0; // Not an identity matrix if any off-diagonal element is not 0
                }
            }
        }

        // If all checks passed, return 1 (identity matrix)
        return 1;
    }
    public void is_It_Identity_Matrix(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Please provide value in separate line for first array");

        arr = insertValues(arr, N, M);
        int result = identityMatrix(arr);

        if (result == 1){
            System.out.print("True");
        }else {
            System.out.print("False");
        }
    }
}

/*
Problem Description
You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.

Problem Constraints
2 <= N <= 103
A[i][j] equals 0 or 1.

Input Format
The first argument is a 2D integer array denoting the matrix A

Output Format
Return 1 if A is an identity matrix, else return 0.
*/
