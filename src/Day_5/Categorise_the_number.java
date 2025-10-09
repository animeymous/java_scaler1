package Day_5;

import java.util.Scanner;

public class Categorise_the_number {
    public void categorise_the_number(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");
        int number = sc.nextInt();

        if(number > 0){
            if(number % 2 == 0){
                System.out.println("Even positive");
            }else{
                System.out.println("Odd positive");
            }
        }else{
            if(number % 2 == 0){
                System.out.println("Even negative");
            }else{
                System.out.println("Odd negative");
            }
        }

    }
}

/*
Problem Description

Given the number N, Categorise the number according to following condition :
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

Note : Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else
Problem Constraints
-10000 <= N <= 10000 except 0
Input Format
Take Number in single line.
Output Format
Print the statement, according to number N in single line.
* */