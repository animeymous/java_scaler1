package Day_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Separate_Odd_Even {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void seperateEvenOdd(int [] arr){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        //seprate odd and even
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        //print odd
        for(int i = 0;i < odd.size(); i++){
            System.out.print(odd.get(i)+" ");
        }
        System.out.println();
        //print even
        for(int i = 0;i < even.size(); i++){
            System.out.print(even.get(i)+" ");
        }
    }
    public void separate_Odd_Even(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of test cases");
        int numberTestCases = sc.nextInt();

        for(int i = 0; i < numberTestCases; i++){
            System.out.println("Please provide integer value for size of array");

            int num = sc.nextInt();
            int [] arr = new int[num];

            System.out.println("Please provide value in separate line");
            arr = insertValues(arr);
            seperateEvenOdd(arr);
        }
    }
}

/*
Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.
NOTE: Array elements should have the same relative order as in A.

Problem Constraints
1 <= T <= 10
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
First line of the input contains a single integer T.

For each test case:
First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.

Output Format

For each test case:
First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A
*/
