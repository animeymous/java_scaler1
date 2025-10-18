package Day_9;

import java.util.Scanner;

public class Sum_of_evens {
    public int calculate_Sum_Of_Evens(int num){
        int sum = 0;

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public void sum_of_evens(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int a = sc.nextInt();
        int result = calculate_Sum_Of_Evens(a);
        System.out.println(result);

    }
}

/*
Problem Description
You are given an integer A, you need to find and return the sum of all the even numbers between 1 and A.
Even numbers are those numbers that are divisible by 2.

Problem Constraints
1 <= N <= 500

Input Format

First and only argument is an integer A.

Output Format
Return an integer denoting the sum of even numbers between [1, A] (both inclusive).
*/
