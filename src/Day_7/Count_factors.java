package Day_7;

import java.util.Scanner;

public class Count_factors {
    public void count_factors(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }


    }
}

/*
Problem Description

Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

Problem Constraints
1 <= N <= 300

Input Format
The first and only line of input contains a single integer N.

Output Format
Print the count of factors of N.
*
* */
