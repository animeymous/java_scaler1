package Day_5;

import java.util.Scanner;

public class Floor_of_A_B {
    public void floor_of_A_B(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((int)(Math.floor(a/b)));
    }
}

/*
Problem Description
Given two numbers A and B. Print the floor of A/B.

Problem Constraints
1 <= A, B <= 104

Input Format

There are two input lines
The first line has a single integer A.
The second line has a single integer B.

Output Format
Print the floor of A/B in a single line.
* */
