package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Return_Numeric_Stair_Pattern {

    //print numeric stair pattern
    public void printStairPattern(int num){
        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 1; i <= num; i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 1; j <= i; j++){
                temp.add(j);
            }
            arr.add(temp);
        }

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public void return_Numeric_Stair_Pattern(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");
        int num = sc.nextInt();
        printStairPattern(num);
    }
}

/*
Problem Description

Given an integer A in the function parameter.
Return a 2D array with A rows such that the i-th row has numbers from 1 to i.

Problem Constraints
1 <= A <= 103

Input Format
Only argument A is an integer.

Output Format
Return a 2D array of integers
*/
