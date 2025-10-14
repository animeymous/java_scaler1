package Day_6;

import java.util.Scanner;

public class Print_perfect_squares {
    public void print_perfect_squares(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;

        while(loop <= num){
            int square = loop * loop;
            if(square > num){
                break;
            }
            loop++;
            System.out.println(square);
        }
    }
}

/*
Problem Description

Take an input of a number A from the user. Print all perfect squares less than or equal to A.
Note - Perfect squares are integers whose square root is an integer. (For Example: 16 is perfect square as √16 = 4, or 42 = 16)

Problem Constraints
1 <= A <= 104

Input Format
A single line consisting of a integer A.

Output Format
Print perfect squares less than or equal to A in a single line in a space-separated manner.
* */