package Day_5;

import java.util.Scanner;

public class Min_of_two {
    public void min_of_two(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value in number for A and B in separate lines");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A greater than B");
        }else{
            System.out.println("B greater than A");
        }
    }
}

/*
Problem Description
Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.

Problem Constraints

1 <= A <= 1000000
1 <= B <= 1000000

Input Format
First line is a single integer A.
Second line is a single integer B.
Output Format
One line containing an integer as per the question.
* */