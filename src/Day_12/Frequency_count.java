package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frequency_count {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    //function to find frequency of elements
    public void findFrequency(List<Integer> arr){
        List<Integer> freqArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            int count = 0;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    count++;
                }
            }
            freqArr.add(count);
        }

        for(int i = 0; i < freqArr.size(); i++){
            System.out.print(freqArr.get(i)+" ");
        }
    }

    public void frequency_count(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>(num);
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr, num);
        findFrequency(arr);
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
