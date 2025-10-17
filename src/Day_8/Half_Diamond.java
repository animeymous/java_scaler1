package Day_8;

import java.util.Scanner;

public class Half_Diamond {
    public void half_Diamond(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num - 1; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Description

Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.
For example if N = 5 then pattern will be like:

*
**
***
****
*****
****
***
**
*
NOTE: There should be no spaces after any * .

Problem Constraints
2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Half Diamond pattern corresponding to the given N.
*/
