package Day_13;

import java.util.Scanner;

public class Diverse_Characters {
    //finc diverse characters
    public void findDiverse(String str){
        int smallCharCount = 0;
        int capCharCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                smallCharCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                capCharCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        int charCount = smallCharCount + capCharCount;

        if(charCount > otherCount && charCount > digitCount){
            System.out.println("Character count "+ charCount);
        } else if (digitCount > otherCount) {
            System.out.println("Digit count "+ digitCount);
        }else {
            System.out.println("Other count "+ otherCount);
        }
    }
    public void diverse_Characters(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide string");
        String str = sc.next();
        findDiverse(str);
    }
}

/*
Problem Description
You are given a character string A having length N.
The string consists of 2 types of characters:

Alphabets : ['a'-'z', 'A'-'Z']
Digits: ['0'-'9']
You have to tell the count of characters of the maximum occuring character type.

Problem Constraints
1 <= N <= 105

Input Format
First and only argument is a character string A.

Output Format
Return an integer.
*/
