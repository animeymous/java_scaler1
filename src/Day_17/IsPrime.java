package Day_17;

import java.util.Map;
import java.util.Scanner;

public class IsPrime {

    //function to check prime
    public void checkPrime(int num){
        boolean isPrimeNumber = true;
        for(int i = 2; i <= Math.abs(num/2); i++){
            if(num % i == 0){
                isPrimeNumber = false;
                break;
            }
        }

        if(isPrimeNumber){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public void isPrime(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");

        int num = sc.nextInt();
        checkPrime(num);
    }
}

/*
Problem Description
Given a number A. Return 1 if A is prime and return 0 if not.

Note :
The value of A can cross the range of Integer.

Problem Constraints
1 <= A <= 109

Input Format
The first argument is a single integer A.

Output Format
Return 1 if A is prime else return 0.
*/