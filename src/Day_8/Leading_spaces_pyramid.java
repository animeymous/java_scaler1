package Day_8;

import java.util.Scanner;

public class Leading_spaces_pyramid {
    public void leading_spaces_pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){

            //printing spaces
            for(int j = num - i; j > 0; j--){
                System.out.print("_");
            }

            //printing stars
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Description
Take an integer N as input, print the corresponding pattern for N.
For example if N = 5 then pattern will be like:

____*
___**
__***
_****
*****
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.
* */
