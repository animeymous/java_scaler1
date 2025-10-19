package Day_9;

import java.util.Scanner;

public class Is_Perfect_Square {
    public int calculate_perfect_sqaure(int A){
        if (A < 0) {
            return 0; // Negative numbers cannot be perfect squares
        }

        // Compute the integer square root of A
        int root = (int) Math.sqrt(A);

        // Check if the square of the integer root equals A
        if (root * root == A) {
            return 1; // A is a perfect square
        } else {
            return 0; // A is not a perfect square
        }
    }
    public void is_Perfect_Square(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int a = sc.nextInt();
        int result = calculate_perfect_sqaure(a);
        System.out.println(result);
    }
}

/*
Problem Description

You are given a function that takes an integer argument A. Return 1 if A is a perfect square otherwise return 0.

A perfect square is an integer that is the square of an integer.
For example 16 is perfect square as it is the square of an integer 4 (42 = 16)


Problem Constraints

1 <= A <= 108




Input Format

First argument is an integer A.

Output Format
Return an integer (0 or 1) based upon the question.

Example Input
Input 1:
    A = 4
Input 2:
A = 1001
*/
