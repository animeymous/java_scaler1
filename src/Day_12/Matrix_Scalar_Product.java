package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix_Scalar_Product {
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

    //calculate product
    public void calculateProduct(List<List<Integer>> arr, int num){
        List<List<Integer>> productArr = new ArrayList<>();

        for(int row = 0; row < arr.size(); row++){
            List<Integer> temp = new ArrayList<>();

            for(int col = 0; col < arr.get(0).size(); col++){
                temp.add(arr.get(row).get(col) * num);
            }
            productArr.add(temp);
        }

        for(int i = 0; i < productArr.size(); i++){
            for(int j = 0; j < productArr.get(0).size(); j++){
                System.out.print(productArr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void matrix_Scalar_Product(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for rows");
        int N = sc.nextInt();

        System.out.println("Please provide integer value for columns");
        int M = sc.nextInt();

        System.out.println("Please provide number which needs to be multiplied");
        int num = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Please provide value in separate line for first array");

        arr = insertValues(arr, N, M);
        calculateProduct(arr, num);
    }
}

/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000
1 <= B <= 1000

Input Format
First argument is 2D array of integers A representing matrix.
Second argument is an integer B.

Output Format
You have to return a 2D array of integers after doing required operations.
*/
