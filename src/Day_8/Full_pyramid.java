package Day_8;

import java.util.Scanner;

public class Full_pyramid {
    public void full_pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            //print spaces
            for(int j = num - i; j > 0; j--){
                System.out.print(" ");
            }
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
Take an integer N, print the corresponding Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:
    *
   * *
  * * *
 * * * *
* * * * *
NOTE: There should be exactly one extra space after each * for each row.

Problem Constraints
2 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the Full Pyramid pattern corresponding to the given N.
*/
