package Day_6;

import java.util.Scanner;

public class Even_Game {
    public void even_Game(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;

        while(loop <= num){
            if(loop % 2 == 0){
                System.out.println(loop);
            }
            loop++;
        }
    }
}

/*
Problem Description
Write a program to print all even numbers from 1 to N where you have to take N as input from the user.
Note: Use while-loop OR for-loop, according to session flow.

Note: You can use int(input()) for obtaining user input of number N.

Problem Constraints

1 <= N <= 1000000
Input Format

A single line representing N
Output Format

All even numbers from 1 to N are separated by spaces.
* */