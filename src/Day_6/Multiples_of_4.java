package Day_6;

import java.util.Scanner;

public class Multiples_of_4 {
    public void multiples_of_4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value");

        int num = sc.nextInt();
        int loop = 1;

        while(loop <= 10){
            System.out.println(loop*num);
            loop++;
        }
    }
}

/*
Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.

Problem Constraints
1 <= N <= 10000

Input Format
Single line containing an integer N.

Output Format
Space separated integers representing multiples of 4 less than or equal to N.
* */
