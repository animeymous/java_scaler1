package Day_5;

import java.util.Scanner;

public class Coding_Rating {
    public void coding_Rating(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide value for A");

        int rating = sc.nextInt();

        if(rating >= 2100 && rating <= 5000){
            System.out.println("GRAND MASTER");
        }else if(rating >= 1900){
            System.out.println("CANDIDATE MASTER");
        }else if(rating >= 1600){
            System.out.println("EXPERT");
        }else if(rating >= 1400){
            System.out.println("pupil");
        }else if(rating == 1333){
            System.out.println("newbie");
        }else{
            System.out.println("NEWBIE");
        }
    }
}

/*
Problem Description

Write a program to input from user an integer(n) representing the rating of a person on a platform.

You have to print the category of that person.

If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master".
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE

Problem Constraints
1000 <= n <= 2500

Input Format
One line containing an integern.

Output Format
A string representing the category of the person.
* */