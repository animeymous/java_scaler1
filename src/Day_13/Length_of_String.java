package Day_13;

import java.sql.Struct;
import java.util.Scanner;

public class Length_of_String {
    //find length of string
    public void findLengthOfString(String str){
        System.out.println("Length of string "+str.length());
    }
    public void length_of_String(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter value how many times to run test");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            String str = sc.next();
            findLengthOfString(str);
        }
    }
}

/*
Problem Description
Write a program to input an integer T and then each of T lines will have a string (S).
You have to print T lines each containing length of input string.

Problem Constraints
1 <= T <= 100
1 <= S.size() <= 1000

Input Format
First line is T which means number of test cases.
Each next T lines contain a string S.

Output Format
T lines each containing an integer representing length of the input string.
*/
