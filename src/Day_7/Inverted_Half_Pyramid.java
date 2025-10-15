package Day_7;

import java.util.Scanner;

public class Inverted_Half_Pyramid {
    public void inverted_Half_Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.
For example if N = 4 then pattern will be like:

****
***
**
*

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Inverted Half Pyramid pattern corresponding to the given N.
*/
