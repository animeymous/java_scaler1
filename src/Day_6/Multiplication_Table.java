package Day_6;

import java.util.Scanner;

public class Multiplication_Table {
    public void multiplication_Table(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value");

        int num = sc.nextInt();
        int count = 1;
        while (count <= 10){
            System.out.println(count * num);
            count++;
        }
    }
}

/*
Problem Description
Take a number A as input, print its multiplication table having the first 10 multiples.

Problem Constraints
1 <= A <= 1000

Input Format
First line contains a single integer A.

Output Format
Print 10 lines, ith line containing ith multiple.
* */
