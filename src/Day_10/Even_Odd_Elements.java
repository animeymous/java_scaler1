package Day_10;

import java.util.Scanner;

public class Even_Odd_Elements {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void findAbsDiff(int [] arr){
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }else {
                oddSum += arr[i];
            }
        }

        int gap = Math.abs(evenSum - oddSum);
        System.out.println("Absolute difference "+gap);
    }

    public void even_Odd_Elements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of test cases");
        int numberTestCases = sc.nextInt();

        for(int i = 0; i < numberTestCases; i++){
            System.out.println("Please provide integer value for size of array");

            int num = sc.nextInt();
            int [] arr = new int[num];

            System.out.println("Please provide value in separate line");
            arr = insertValues(arr);
            findAbsDiff(arr);
        }

    }
}

/*
Problem Description

You are given T(number of test cases) integer arrays. For each array A,
you have to find the value of absolute difference between the counts of even and odd elements in the array.

Problem Constraints

1 <= T <= 10
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format

First line contains a single integer T.
Each of the next T lines begin with an integer denoting the length of the array A (|A|), followed by |A| integers which indicate the elements in the array.

Output Format
For each test case, print an integer in a separate line.
*/
