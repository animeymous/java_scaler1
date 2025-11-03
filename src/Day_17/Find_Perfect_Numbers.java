package Day_17;

import java.util.Scanner;

public class Find_Perfect_Numbers {

    //find perfect number
    public void perfectNumber(int num){
        int sum = 0;

        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }

    public void find_Perfect_Numbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");

        int num = sc.nextInt();
        perfectNumber(num);
    }
}

/*
Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
A proper divisor of a natural number is the divisor that is strictly less than the number.

Problem Constraints
1 <= A <= 106

Input Format
First and only argument contains a single positive integer A.

Output Format
Return 1 if A is a perfect number and 0 otherwise.
*/
