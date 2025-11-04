package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Time_to_equality {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //find max
    public int findMax(List<Integer> list){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }

    //calculate time
    public void timeToEqualify(List<Integer> list, int maxValue){
        int time = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < maxValue){
                time = (maxValue - list.get(i)) + time;
            }
        }

        System.out.println("Time "+time);
    }

    public void time_to_equality(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        int maxValue = findMax(list);
        timeToEqualify(list, maxValue);
    }
}

/*
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000

Input Format
First argument is an integer array A.

Output Format
Return an integer denoting the minimum time to make all elements equal.
*/
