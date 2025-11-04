package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Linear_Search_Multiple_Occurences {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //find occurrences of element
    public void findoccurrences(List<Integer> list, int num){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == num){
                count++;
            }
        }

        System.out.println("Count "+count);
    }

    public void linear_Search_Multiple_Occurrences(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        System.out.println("Provide number to get searched");
        int search = sc.nextInt();

        findoccurrences(list, search);
    }
}

/*
Problem Description
Given an array A and an integer B, find the number of occurrences of B in A.

Problem Constraints
1 <= B, Ai <= 109
1 <= length(A) <= 105

Input Format
Given an integer array A and an integer B.

Output Format
Return an integer, number of occurrences of B in A.
*/
