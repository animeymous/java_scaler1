package Day_13;

import java.util.Scanner;

public class Low_to_High_2 {

    //function to change string from lower to upper
    public void lowToHigh(String str){
        System.out.println(str.toUpperCase());
    }
    public void Low_to_High_2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide string");
        String str = sc.next();

        lowToHigh(str);
    }
}

/*
Problem Description
You are given lowercase string (S) and you have to return a string that is the uppercase form of S.

Problem Constraints
1 <= S.size() <= 1000

Input Format
First and only argument containing a lowercase string S.

Output Format
You have to return uppercase form of input string.
*/
