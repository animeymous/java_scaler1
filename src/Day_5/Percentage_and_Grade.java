package Day_5;

import java.util.Scanner;

public class Percentage_and_Grade {
    public void percentage_and_Grade(){
        System.out.println("Please provide marks of 5 subjects in separate lines");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        int total = (sum * 100)/500;

        if(total >= 90){
            System.out.println(total);
            System.out.print("A");
        }else if( total >= 80 && total < 90){
            System.out.println(total);
            System.out.print("B");
        }else if( total >= 70 && total < 80){
            System.out.println(total);
            System.out.print("C");
        }else if( total >= 60 && total < 70){
            System.out.println(total);
            System.out.print("D");
        }else if( total >= 40 && total < 60){
            System.out.println(total);
            System.out.print("E");
        }else {
            System.out.println(total);
            System.out.print("F");
        }
    }
}

/*
Problem Description

Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student).
Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F

NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.
Input Format
There will be five lines of inputs as following:
The five lines contain the 5 subject marks of the student in numerical format.

Output Format

The first line indicates the percentage in integer format.
The next line displays the grade in string format.
* */