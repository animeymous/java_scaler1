package Day_5;

import java.util.Scanner;

public class Which_triangle {
    public void which_triangle(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide valude for A, B, C in separate lines");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if(num1 == num2 && num1 == num3){
            System.out.println("equilateral");
        }else if(num1 == num2 || num2 == num3 || num3 == num1){
            System.out.println("isosceles");
        }else {
            System.out.println("scalene");
        }
    }
}

/*
Problem Description

Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles".
Problem Constraints

1 <= A <= 100000
1 <= B <= 100000
1 <= C <= 100000

Note: It is guaranteed that the given sides form a valid triangle.
Input Format
One line containing three space separated integers A, B & C.
Output Format
One string either "equilateral", "scalene" or "isosceles".
* */
