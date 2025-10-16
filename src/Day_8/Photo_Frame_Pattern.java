package Day_8;

import java.util.Scanner;

public class Photo_Frame_Pattern {
    public void photo_Frame_Pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            //print first and last row
            if(i == 1 || i == num){
                for(int j = 1; j <= num; j++){
                    System.out.print("*");
                }
            }else{
                //print middle rows
                for(int k = 1; k <= num; k++){
                    if (k == 1 || k == num){
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

Take an integer N as input, print the corresponding pattern for N.
For example if N = 5 then pattern will be like:

*****
*   *
*   *
*   *
*****
Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.

Problem Constraints
3 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.
*/
