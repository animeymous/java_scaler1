package Day_6;

import java.util.Scanner;

public class From_down_to_top {
    public void from_down_to_top(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();

        while(num >= 1){
            System.out.println(num);
            num--;
        }
    }
}

/*
Problem Description

Write a program to print all Natural numbers from N to 1 where you have to take N as input from user

Problem Constraints
1 <= N <= 10000000

Input Format
A single line representing N

Output Format
N space separated integers from N to 1.
* */
