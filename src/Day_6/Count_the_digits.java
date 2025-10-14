package Day_6;

import java.util.Scanner;

public class Count_the_digits {
    public void count_the_digits(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for number");
        int number = sc.nextInt();
        int count = 0;

        while (number > 0){
            count++;
            number = number/10;
        }

        System.out.println("Digits "+ count);
    }
}

/*
Problem Description
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the count of digits of that number.

Note: No of digits for number 0 is considered as 1.

Problem Constraints

1 <= T <= 1000
0 <= N <= 100000000

Input Format

The first line is the number T which denotes the total number of test cases.
Next T lines contain an integer N for which you have to print the number of digits.
Output Format

For T different Numbers, Print the number of digits in separate lines.
* */
