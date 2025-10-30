package Day_13;

import java.util.Scanner;

public class Palindrome_or_not {

    //function to if string is palindrome or not
    public void checkPalindrome(String str){
        int last = str.length() - 1;
        int first = 0;
        boolean isPalindrome = true;

        while (first < last){

            if(str.charAt(first) == str.charAt(last)){
                first++;
                last--;
            }else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
    public void palindrome_or_not(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide string");
        String str = sc.next();

        checkPalindrome(str);
    }
}

/*
Problem Description:
Write a program to check whether the given string is a palindrome or not. Return True if it is palindrome else return False.
Note: A string is said to be a palindrome if the reverse of the string is the same as the string itself.

Input Format:

First line will have the number of test cases. For each testcase there will be single line of input consisting of a string.
Output Format:

True if palindrome else False
*/
