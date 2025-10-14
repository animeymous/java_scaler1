package Day_6;

import java.util.Scanner;

public class Summation_Game {
    public void summation_Game(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;
        int sum = 0;

        while(loop <= num){
            sum += loop;
            loop++;
        }
        System.out.println(sum);
    }
}

/*
Problem Description
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

Problem Constraints
1 <= N <= 1000

Input Format
A single line representing N

Output Format
A single integer showing sum of all Natural numbers from 1 to N
* */
