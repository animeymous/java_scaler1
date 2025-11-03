package Day_17;

import java.util.Scanner;

public class Count_Factors2 {

    //count factors
    public void countFactor(int num){
        int count = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }

        System.out.println("Count of factors "+count);
    }
    public void count_Factors2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");

        int num = sc.nextInt();
        countFactor(num);
    }
}

/*
Problem Description
Given an integer A, you need to find the count of it's factors.
Factor of a number is the number which divides it perfectly leaving no remainder.
Example : 1, 2, 3, 6 are factors of 6

Problem Constraints
1 <= A <= 109

Input Format
First and only argument is an integer A.

Output Format
Return the count of factors of A.
*/
