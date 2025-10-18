package Day_9;

import java.util.Scanner;

public class Count_of_primes {
    public boolean isPrime(int num){
        for(int i = 2; i <= Math.abs(num/2); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public int count_primes(int num){
        int count = 0;

        for(int i = 2; i <= num; i++){
            boolean result = isPrime(i);
            if(result) {
                count++;
            }
        }
        return count;
    }
    public void count_of_primes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int a = sc.nextInt();
        int count = count_primes(a);
        System.out.println(count);

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
* */
