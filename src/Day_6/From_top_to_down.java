package Day_6;

import java.util.Scanner;

public class From_top_to_down {
    public void from_top_to_down(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;

        while(loop <= num){
            System.out.println(loop);
            loop++;
        }
    }
}

/*
Problem Description

Write a program that takes a positive integer N as input from the user and prints all natural numbers from 1 to N,
with each number followed by a space (including the last number).

Problem Constraints
1 <= N <= 1000000

Input Format
A single line representing N

Output Format
N space separated integers from 1 to N, with each number followed by a space, including the last number.
* */
