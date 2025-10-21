package Day_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frequency_count {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void countFrequency(int [] arr){
        List<Integer> countFreq = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            countFreq.add(count);
        }

        for(int i = 0; i < countFreq.size(); i++){
            System.out.print(countFreq.get(i)+" ");
        }
    }
    public void frequency_count(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        countFrequency(arr);
    }
}

/*
Problem Description

You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .

Note:

When comparing two elements of the ArrayList(java), make sure to use .equals() method for accurate comparison.
Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).

Problem Constraints
1 <= len(A) <= 1000
1 <= A[i] <= 100

Input Format
First argument is an array of integers representing array A.

Output Format
You have to return an array of integers as per the question.
*/
