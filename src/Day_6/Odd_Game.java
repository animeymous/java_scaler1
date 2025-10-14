package Day_6;

import java.util.Scanner;

public class Odd_Game {
    public void odd_Game(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;

        while(loop <= num){
            if(loop % 2 != 0){
                System.out.println(loop);
            }
            loop++;
        }
    }
}

/*
Problem Description

Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

Note:
Each number should be followed by a space, including the last number.

Problem Constraints
1 <= N <= 2000000

Input Format
A single line representing N

Output Format
All odd numbers from 1 to N, each number followed by a s
* */
