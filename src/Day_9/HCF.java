package Day_9;

import java.util.Scanner;

public class HCF {
    public int calculate_hcf(int a, int b){
        int max = Math.max(a, b);
        int hcf = 1;
        for(int i = 2; i <= max; i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }
    public void hCF(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calculate_hcf(a,b);
        System.out.println(result);
    }
}

/*
Problem Description
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers
happens to be the largest positive integer that divides the numbers without leaving a remainder.


Problem Constraints
1 <= A,B <= 100000

Input Format
First line will contain 2 integers A and B

Output Format
An integer which is the HCF of A & B.
*/
