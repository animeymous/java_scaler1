package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisible_by_5and7 {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    //function to check if elements divide by 5 & 7
    public void checkDivide(List<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 5 == 0 && arr.get(i) % 7 == 0){
                System.out.print(arr.get(i)+" ");
            }
        }
    }
    public void divisible_by_5and7(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>(num);
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr, num);
        checkDivide(arr);
    }
}

/*
Problem Description
Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.

Problem Constraints
1 <= A.size() <= 105
1 <= A[i] <= 105

Input Format
The only argument is an Integer Array A.

Output Format
Return an Integer Array, denoting the elements that are divisible by 5 and 7 from the given list.
*/
