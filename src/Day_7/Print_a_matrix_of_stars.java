package Day_7;

import java.util.Scanner;

public class Print_a_matrix_of_stars {
    public void print_a_matrix_of_stars(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number in separate lines");

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int row = 1; row <= N; row++){
            for(int col = 1; col <= M; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Description
Given two integers N and M as inputs, print a rectangle of N * M stars.

For example if N = 3, M = 4 then pattern will be like:

****
****
****

Problem Constraints
2 <= N, M <= 100

Input Format

First line of input contains an integers N (no of rows).
Second line of input contains an integer M (no of cols).

Output Format
Output N * M rectangle of stars.
* */