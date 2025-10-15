package Day_7;

import java.util.Scanner;

public class Print_N_stars {
    public void print_N_stars(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.print("*");
        }
    }
}

/*
Problem Description

Given an integer N, print N stars in a single line.
For example if N = 5 then pattern will be like:

*****

Problem Constraints
2 <= N <= 100

Input Format
Single line input contains a single integer N.

Output Format
Output N stars in a single line.
* */
