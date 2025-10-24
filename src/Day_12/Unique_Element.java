package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unique_Element {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    //function to find unique element
    public void findUnique(List<Integer> arr){
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        System.out.println("Unique "+result);
    }
    public void unique_Element(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>(num);
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr, num);
        findUnique(arr);
    }
}

/*
Problem Description
Given an Array of integers A, every element in it is repeated twice except one, find that unique element.

Problem Constraints
1<= Length of array A <= 103
0<= Ai <=1000

Input Format
First argument A is the given array.

Output Format
Return an Integer X, such that X occurs once in the A.
*/
