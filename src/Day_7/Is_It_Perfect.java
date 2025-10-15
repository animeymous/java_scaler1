package Day_7;

import java.util.Scanner;

public class Is_It_Perfect {
    public void is_It_Perfect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide value to run number of test cases");
        int numberTestCases = sc.nextInt();

        for(int i = 0; i < numberTestCases; i++){
            System.out.println("Please provide value");
            int num = sc.nextInt();
            int sumOfDivisors = 0;

            for(int j = 1; j < num; j++){
                if(num % j == 0){
                    sumOfDivisors += j;
                }
            }

            if(sumOfDivisors == num){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

/*
Problem Description

Given the Number of Test Cases as T,
For each test case, take an integer N as input, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).
A positive proper divisor divides a number without leaving any remainder.

Problem Constraints
1 <= T <= 10
1 <= N <= 106

Input Format
The first line of the input contains a single integer T.
Each of the next T lines contains a single integer N.

Output Format
For each testcase, print YES if the given integer is perfect, else print NO, in a separate line
* */
