package Day_6;

import java.util.Scanner;

public class Palindromic_Integer {
    public void palindromic_Integer(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");
        int value = sc.nextInt();
        int tempValue = value;
        int sum = 0;

        while (tempValue > 0){
            int temp = tempValue%10;
            sum = sum*10;
            sum += temp;
            tempValue = tempValue/10;
        }
        if (sum == value){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}

/*
Problem Description

You are given an integer A as input and you need to determine whether it is a palindrome or not.
A palindrome integer is one whose digits, when reversed, result in the same number.
For example, 121 is a palindrome because its reverse is also 121, but 123 is not a palindrome because its reverse is 321.

Note: The given integer will not have any leading zeros.

Problem Constraints
1 <= A <= 106

Input Format
First and the only line contains a single integer A.

Output Format
Print Yes if it is palindromic, else print No.
* */