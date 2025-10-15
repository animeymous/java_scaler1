package Day_7;

import java.util.Scanner;

public class Is_It_Prime {
    public void is_It_Prime(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");
        int num = sc.nextInt();

        int countFactor = 0;

        for(int i = 2; i <= Math.abs(num/2); i++){
            if(num % i == 0){
                countFactor++;
            }
        }

        if(countFactor > 0){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
    }
}

/*
Problem Description

Take an integer A as input, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

Problem Constraints
1 <= A <= 106

Input Format
First and only line of the input contains a single integer A.

Output Format
Print YES if A is a prime, else print NO.
* */
