package Day_8;

import java.util.Scanner;

public class Inverted_Numeric_Pyramid {
    public void inverted_Numeric_Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
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
Take an integer N as input, print the corresponding Numeric Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

1 2 3 4
1 2 3
1 2
1

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.

NOTE: There should be no extra spaces after last integer and before first integer in any .
All integers in any row in the pattern are separated by a single space.
* */
