package Day_8;

import java.util.Scanner;

public class Hollow_Inverted_Half_Pyramid {
    public void hollow_Inverted_Half_Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
            //print first line
            if(i == num){
                for(int k = 1; k <= num; k++){
                    System.out.print("*");
                }
            }else{
                for(int j = 1; j <= i; j++){

                    //print first and last, spaces in middle
                    if(j == 1 || j == i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

/*
Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.
For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Hollow Inverted Half Pyramid pattern corresponding to the given N.
*/