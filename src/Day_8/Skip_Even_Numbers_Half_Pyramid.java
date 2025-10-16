package Day_8;

import java.util.Scanner;

public class Skip_Even_Numbers_Half_Pyramid {
    public void skip_Even_Numbers_Half_Pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                if(j < i){
                    System.out.print("_");
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

1
1_
1_3
1_3_
1_3_5
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.

Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.
* */
