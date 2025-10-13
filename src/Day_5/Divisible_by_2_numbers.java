package Day_5;

import java.util.Scanner;

public class Divisible_by_2_numbers {
    public void divisible_by_2_numbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");

        int a = sc.nextInt();

        if(a % 5 == 0 && a % 11 == 0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

/*
Problem Description
Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

Problem Constraints
1 <= A <= 109

Input Format
The input contains a single integer A.

Output Format
Print 1 if A is divisible by both 5 and 11, else print 0.
* */
