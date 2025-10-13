package Day_5;

import java.util.Scanner;

public class Min_of_three {
    public void min_of_three(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for a, b, c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && a < c){
            System.out.println("A minimum among all");
        }else if (b < c){
            System.out.println("B minimum among all");
        }else{
            System.out.println("C minimum among all");
        }
    }
}

/*
Problem Description

Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.
Problem Constraints

1 <= A <= 1000000
1 <= B <= 1000000
1 <= C <= 1000000

Input Format

First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.

Output Format
One line containing an integer as per the question.
* */
