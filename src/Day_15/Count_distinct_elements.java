package Day_15;

import java.util.*;

public class Count_distinct_elements {
    //fill array
    public List<Integer> fillArray(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }

        return arr;
    }

    //find count of elements with frequency 1
    public void count(List<Integer> arr){
        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < arr.size(); i++){
            hashSet.add(arr.get(i));
        }

        System.out.println("Distinct : "+hashSet.size());
    }
    public void count_distinct_elements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide size of array");
        int num = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr = fillArray(arr, num);
        count(arr);
    }
}

/*
Problem Description
Given an array A of N integers, return the number of unique elements in the array.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109

Input Format
First argument A is an array of integers.
Output Format
Return an integer.
*/
