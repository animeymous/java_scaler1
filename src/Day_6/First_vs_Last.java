package Day_6;

import java.util.Scanner;

public class First_vs_Last {
    public void first_vs_Last(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for number of test cases");
        int numberTestCases = sc.nextInt();

        while(numberTestCases > 0){
            int number = sc.nextInt();
            int tempDigit = number;
            int countDigit = 0;

            int lastDigit = tempDigit%10;

            while(tempDigit > 0){
                countDigit++;
                tempDigit = tempDigit/10;
            }


            while(countDigit > 1){
                number = number/10;
                countDigit--;
            }

            System.out.println("First Digit  "+number+ " Last Digit "+ lastDigit);
            numberTestCases--;
        }
    }
}

/*
Problem Description

Write a program that asks the user to input a number T, indicating the number of test cases.
Then, for each test case, ask for input a number N and print the first and last digits of N.

Problem Constraints
1 <= T <= 1000
0 <= N <= 100000000

Input Format
First line is T which means number of test cases.
Each next T lines contain an integer N.

Output Format
T lines each containing two space separated integers representing first and last digits of the input integer.
* */