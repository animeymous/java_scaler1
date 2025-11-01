package Day_13;

import java.util.Scanner;

public class High_to_Low2 {

    //function to convert string High to low
    public void convertString(String str){

        System.out.println(str.toLowerCase());
    }
    public void high_to_Low2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide string in Capital letters");

        String str = sc.next();
        convertString(str);


    }
}

/*
Problem Description

You are given uppercase string (S) and you have to return a string that is the lower case form of S.
Uppercase strings are those which have all letters in uppercase (Example: MACHINE)
Lowercase strings are those which have all letters in lowercase (Example: machine)

Problem Constraints

1 <= S.size() <= 1000
Input Format

First and only argument containing a uppercase string **S**.
Output Format

You have to return lowercase form of input string.
*/