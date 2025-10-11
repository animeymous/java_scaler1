package Day_5;

import java.util.Scanner;

public class Max_of_three {
    public void max_of_three(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value of A, B, C input in separate lines");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is greater than B and C");
        }else if(b > c){
            System.out.println("B is greater than A and C");
        }else{
            System.out.println("C is greater than A and B");
        }
    }
}

/*
Problem Description
Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.
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