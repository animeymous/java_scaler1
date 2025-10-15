package Day_7;

import java.util.Scanner;

public class Two_Line_Star_Pattern {
    public void two_Line_Star_Pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            int numberOfSpaces = num - 2;
            System.out.print("*");
            for(int j = 1; j <= numberOfSpaces; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

/*
Problem Description

Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line,
with N-2 spaces in between.

The Pattern should look like:

*<N-2 Spaces>*
Print the above pattern for a total of N Rows.

Problem Constraints
2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.
*/
