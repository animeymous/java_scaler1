package Day_7;

import java.util.Scanner;

public class Numeric_Stair_Pattern {
    public void numeric_Stair_Pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                if(j < i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Problem Description

Take an integer N as input, print the corresponding pattern for N.
For example if N = 4 then pattern will be like:

1
1 2
1 2 3
1 2 3 4

NOTE: There should be no extra spaces after last integer.

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.

NOTE:

There should be no extra spaces after last integer and before first integer in any row.
All integers in any row in the pattern are space separated.
* */
