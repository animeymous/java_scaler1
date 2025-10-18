package Day_9;

import java.util.Scanner;

public class Power_function {
    public int calculate_Power(int base, int power){
        int result = 1;

        while (power > 0){
            result = result * base;
            power--;
        }

        return result;
    }
    public void power_function(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = calculate_Power(base, power);
        System.out.println(result);

    }
}

/*
Problem Description
You are given two integers A and B.
You have to find the value of AB.
NOTE: The value of answer is always less than or equal to 109.

Problem Constraints
1 <= A, B <= 1000

Input Format

First parameter is an integer A.
Second parameter is an integer B.

Output Format
Return an integer.
*/
