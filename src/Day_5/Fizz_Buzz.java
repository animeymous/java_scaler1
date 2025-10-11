package Day_5;

import java.util.Scanner;

public class Fizz_Buzz {
    public void fizz_Buzz(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");
        int a = sc.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (a % 3 == 0) {
            System.out.println("Fizz");
        } else if (a % 5 == 0) {
            System.out.println("Bizz");
        }else{
            System.out.println("Number is not multiple of 3 and 5");
        }
    }
}

/*
Problem Description

Write a program that takes in a number N as input and does the following:

if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz
Problem Constraints:

1 <= N <= 1000

Input Format

There is only 1 single line in the input, which is the integer N.

Output Format

Print Fizz / Buzz / FizzBuzz depending on the value N.
* */