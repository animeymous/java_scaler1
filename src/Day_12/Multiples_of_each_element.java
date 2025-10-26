package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiples_of_each_element {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    // multiple of each element

    public void findMultipleOfEach(List<Integer> arr1, List<Integer> arr2){
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr2.size(); i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < arr1.size(); j++){
                if(arr1.get(j) % arr2.get(i) == 0){
                    temp.add(arr1.get(j));
                }
            }
            result.add(temp);
        }

        for(int i = 0; i < result.size(); i++){
            for(int j = 0; j < result.get(i).size(); j++){
                System.out.print(result.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public void multiples_of_each_element(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide size for first array");
        int num = sc.nextInt();

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        System.out.println("Please provide value in separate line");
        arr1 = insertValues(arr1, num);

        System.out.println("Please provide size for second array");
        num = sc.nextInt();

        System.out.println("Please provide value in separate line");
        arr2 = insertValues(arr2, num);

        findMultipleOfEach(arr1, arr2);
    }
}

/*
Problem Description

Given 2 arrays of integers A and B
Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in sequential order

Problem Constraints
1 <= |A| <= 103
1 <= |B| <= 103
1 <= A[i] <= 105
1 <= B[i] <= 105

Input Format
The two arguments A and B are array of integers.

Output Format
Return a 2D array of integers.
*/
