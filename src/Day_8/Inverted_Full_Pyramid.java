package Day_8;

import java.util.Scanner;

public class Inverted_Full_Pyramid {
    public void inverted_Full_Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();
        int count = 0;
        for(int i = num; i > 0; i--){
            //print spaces
            for(int k = 0; k <= count; k++ ){
                System.out.print(" ");
            }
            count++;

            //print stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
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

Take an integer N as input, and print the corresponding Inverted Full Pyramid pattern for N.



For example if N = 5 then pattern will be like:

* * * * *
 * * * *
  * * *
   * *
    *
NOTE: There should be exactly one extra space after each * for each row.
Problem Constraints

2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Inverted Full Pyramid pattern corresponding to the given N.
*/
