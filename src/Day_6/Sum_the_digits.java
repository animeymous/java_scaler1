package Day_6;

import java.util.Scanner;

public class Sum_the_digits {
    public void sum_the_digits(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for number");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0){
            int temp = number%10;
            sum += temp;
            number = number/10;
        }
        System.out.println("Sum "+sum);
    }
}

/*
Problem Description
You take a number of test cases, denoted by T as input.For each test case, you should take integers N as input.
Your task is to calculate and print the sum of the digits of the given number N.

Problem Constraints

1 <= T <= 1000
0 <= N <= 100000000
Input Format

The first line is T which means the total number of test cases.
Each of the next T lines contain an integer N.
. Output Format

T lines each containing one integer representing the sum of the digits of the input integer.
* */
