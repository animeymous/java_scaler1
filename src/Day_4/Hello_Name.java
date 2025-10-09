package Day_4;

import java.util.Scanner;

public class Hello_Name {
    public void hello_Name(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Hello "+str);
    }
}

/*
Problem Description

Take a name A as input from the user and print "Hello A", where A is the name in input.

Problem Constraints

1 <= len(A) <= 15 Characters in A are in lowercase English Alphabets.
Input Format

There is a single input line, which is the string **A**.
Output Format

Print in a single line "Hello A" without quotes.
* */
