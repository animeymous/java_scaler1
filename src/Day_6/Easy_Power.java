package Day_6;

import java.util.Scanner;

public class Easy_Power {
    public void easy_Power(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide values in separate lines");
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;

        while (power > 0){
            result *= base;
            power--;
        }

        System.out.println("Power "+result);
    }
}

/*
Problem Description

You are given two integers A and B. You have to find the value of AB.
NOTE: The value of AB will always be less than or equal to 109.

Problem Constraints
1 <= A, B <= 1000

Input Format
First line of the input contains a single integer A.
econd line of the input contains a single integer B.

Output Format
Print a single integer in single line.
* */
