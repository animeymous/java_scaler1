package Day_10;

import java.util.Scanner;

public class Copy_the_Array {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void copyArray(int [] arr){
        //new array
        int [] copyArr = new int[arr.length];

        //copy array
        for(int i = 0; i < arr.length; i++){
            copyArr[i] = arr[i];
        }

        System.out.println();

        //print old array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //print new array
        for(int i = 0; i < copyArr.length; i++){
            System.out.print(copyArr[i]+" ");
        }
    }
    public void copy_the_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        copyArray(arr);
    }
}

/*
Problem Description
You are given a constant array A and an integer B.
You are required to return another array where outArr[i] = A[i] + B.

Problem Constraints

1 <= A.size() <= 10000
1 <= A[i] <= 10000
1 <= B <= 10000

Input Format

First argument is a constant array A.
Second argument is an integer B.

Output Format
You have to return an integer array.
*/
