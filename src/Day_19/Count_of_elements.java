package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_of_elements {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //count elements
    public void countElement(List<Integer> list){
        int count = 0;
        int max = Integer.MIN_VALUE;

        //find max
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        //find max's freq
        for(int i = 0; i < list.size(); i++){
            if(max == list.get(i)){
                count++;
            }
        }

        //count = N - frequency_of_max_element
        System.out.println("Count "+(max - count));
    }
    public void count_of_elements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        countElement(list);
    }
}

/*
Problem Description

Given an array A of N integers.
Count the number of elements that have at least 1 elements greater than itself.

Problem Constraints
1 <= N <= 103
1 <= A[i] <= 109

Input Format
First and only argument is an array of integers A.

Output Format
Return the count of elements.
*/
