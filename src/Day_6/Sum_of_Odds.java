package Day_6;

import java.util.Scanner;

public class Sum_of_Odds {
    public void sum_of_Odds(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for number");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0){
            int temp = number%10;
            if(temp % 2 != 0){
                sum += temp;
            }
            number = number/10;
        }
        System.out.println("Sum of odds "+sum);
    }
}

/*
Problem Description
Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].

Problem Constraints
1 <= A <= 1000

Input Format
First and only line contains a single positive integer A.

Output Format
Print the required sum in a single line.
* */