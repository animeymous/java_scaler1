package Day_5;

import java.util.Scanner;

public class Which_Month {
    public void which_Month(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number between 1 to 12");
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("Febuary");
        } else if (number == 3) {
            System.out.println("March");
        } else if (number == 4) {
            System.out.println("April");
        } else if (number == 5) {
            System.out.println("May");
        } else if (number == 6) {
            System.out.println("June");
        } else if (number == 7) {
            System.out.println("July");
        }else if (number == 8) {
            System.out.println("August");
        } else if (number == 9) {
            System.out.println("September");
        } else if (number == 10) {
            System.out.println("October");
        }else if (number == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }
    }
}

/*
Problem Description

Write a program to input an integer(A) from user and print the Ath month of the year.
Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

Problem Constraints
1 <= A <= 12
Input Format
One line containing an integer integer A.
Output Format
One line containing the Ath month of the year.
* */