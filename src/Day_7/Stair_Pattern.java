package Day_7;

import java.util.Scanner;

public class Stair_Pattern {
    public void stair_Pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Description

Take an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the stair pattern corresponding to the given N.
* */