package Day_9;

import java.util.Scanner;

public class LCM {
    public int calculate_lc(int a, int b){
        for(int i = 2; true; i++){
            if(i % a == 0 && i % b == 0){
                return  i;
            }
        }
    }
    public void lCM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calculate_lc(a,b);
        System.out.println(result);
    }
}

/*
Problem Description
Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B).
And the LCM is the smallest or least positive integer that is divisible by both A and B.

Problem Constraints
1 <= A,B <= 200

Input Format
Two space separated integers A and B in the input.

Output Format
Output a single integer that is the LCM of A and B.
*/
