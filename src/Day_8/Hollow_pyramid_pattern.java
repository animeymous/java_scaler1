package Day_8;

import java.util.Scanner;

public class Hollow_pyramid_pattern {
    public void hollow_pyramid_pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();
        int spaces = 0;

        for(int i = num; i > 0; i--){

            //print stars
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }

            //print spaces
            for(int k = 1; k <= spaces; k++){
                System.out.print(" ");
            }

            //print stars
            for(int l = i; l > 0; l--){
                System.out.print("*");
            }

            //to reducec spaces
            spaces = spaces + 2;

            System.out.println();
        }
    }
}

/*
Problem Description

Take an integer N as input, print the corresponding pattern for N.
For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces
NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.

Problem Constraints
2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Full Pyramid pattern corresponding to the given N.
*/