package Day_13;

import java.util.Scanner;

public class Copy_The_String {

    //function to copy string
    public void copyString(String str){
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            newStr += str.charAt(i);
        }

        System.out.println("Copied string "+newStr);
    }
    public void copy_The_String(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide string");

        String str = sc.next();


    }
}

/*
Problem Description

You will be given a constant string (A).
You have to return another copy of that input string after removing last character from it.

Problem Constraints
1 <= A.size() <= 1000

Input Format
First argument containing a lowercase constant string A.

Output Format
You have to return a string as per the question.
*/
