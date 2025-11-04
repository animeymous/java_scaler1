package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Max_Min_of_an_Array {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //find min max
    public void minMax(List<Integer> list){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            } else if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Min "+min+" Max "+max);
    }
    public void max_Min_of_an_Array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        minMax(list);
    }
}

/*
Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109

Input Format
First argument A is an integer array.

Output Format
Return the sum of maximum and minimum element of the array
*/
