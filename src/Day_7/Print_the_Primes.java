package Day_7;

import java.util.Scanner;

public class Print_the_Primes {
    public void print_the_Primes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 2; i <= num; i++){
            int count = 0;
            for(int j = 2; j <= Math.abs(i/2); j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }

    }
}

/*
Problem Description

You are given an integer N you need to print all the Prime Numbers between 1 and N.
Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.

Problem Constraints
1 <= N <= 300

Input Format
First and only line of input contains a single integer N.

Output Format
Print all the prime numbers between between 1 and N each in a new line.
* */
