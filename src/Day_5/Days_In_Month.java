package Day_5;

import java.util.Scanner;

public class Days_In_Month {
    public void days_In_Month(){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if(A == 1){
            System.out.println("31");
        }else if(A == 2){
            System.out.println("28");
        }else if(A == 3){
            System.out.println("31");
        }else if(A == 4){
            System.out.println("30");
        }else if(A == 5){
            System.out.println("31");
        }else if(A == 6){
            System.out.println("30");
        }else if(A == 7){
            System.out.println("31");
        }else if(A == 8){
            System.out.println("31");
        }else if(A == 9){
            System.out.println("30");
        }else if(A == 10){
            System.out.println("31");
        }else if(A == 11){
            System.out.println("30");
        }else{
            System.out.println("31");
        }
    }
}

/*
Problem Description
You are given an integer A.
You have to tell how many days are there in the month denoted by A in a non-leap year.
Months are denoted as follows:

January : 1
February : 2
March : 3
April : 4
May : 5
June : 6
July : 7
August : 8
September : 9
October : 10
November : 11
December : 12

Problem Constraints
1 <= A <= 12

Input Format
The input contains a single integer A.

Output Format
Print a single integer denoting the number of days on a single line.
* */
