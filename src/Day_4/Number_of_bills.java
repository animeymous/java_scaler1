package Day_4;

import java.util.Scanner;

public class Number_of_bills {
    public void number_of_bills(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input A");
        float a = sc.nextFloat();
        System.out.println("Give input B");
        int b = sc.nextInt();
        System.out.println((int)a/b);
    }
}

/*
Problem Description

Given total bills amount and amount of a single bill. Print number of bills.

Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.

Input Format

The first line contains a real number N denoting the total budget.
The second line contains an integer M denoting the value of a single bill.
Output Format

Print in a single line denoting the total number of bills that can fit in the total budget.
Problem Constraints

1 <= N <= 10000
1 <= M <= 100
*/
