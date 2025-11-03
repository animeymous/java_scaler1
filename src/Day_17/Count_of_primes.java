package Day_17;

import java.util.Scanner;

public class Count_of_primes {
    //function to check if number is prime
    public boolean isPrime(int num){

        for(int i = 2; i <= Math.abs(num/2); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    //function to count primes
    public void countPrimes(int num){
        int count = 0;

        for(int i = 2; i <= num; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                count++;
            }
        }

        System.out.println("Count of primes "+ count);
    }
    public void count_of_primes(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");

        int num = sc.nextInt();
        countPrimes(num);
    }
}

/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

Problem Constraints
0 <= n <= 10^3

Input Format
Single input parameter n in function.

Output Format
Return the count of prime numbers less than or equal to n.
*/
