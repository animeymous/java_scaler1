package Day_8;

import java.util.Scanner;

public class Hollow_inverted_pyramid_pattern {
    public void hollow_inverted_pyramid_pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();
        int spaces = 2 * (num-1);

        for(int i = 1; i <= num; i++){

            //print stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //print spaces
            for(int k = 1; k <= spaces; k++){
                System.out.print("_");
            }

            //print stars
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }

            //to reducec spaces
            spaces = spaces - 2;

            System.out.println();
        }
    }
}

/*
Problem Description
Take an integer N as input, print the corresponding pattern for N.
For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

Problem Constraints
2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Full Pyramid pattern corresponding to the given N.
*/
