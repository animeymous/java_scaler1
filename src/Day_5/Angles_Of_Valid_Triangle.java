package Day_5;

import java.util.Scanner;

public class Angles_Of_Valid_Triangle {
    public void angles_Of_Valid_Triangle(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumOfAngles = a + b + c;
        if(sumOfAngles == 180){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}

/*
Problem Description

You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
A triangle is valid if sum of its angles equals to 180.

NOTE: You have to take the input of 3 sides of triangle from the user.
Problem Constraints
1 <= A, B, C <= 180

Input Format
First line of the input contains an integer A.
Second line of the input contains an integer B.
Third line of the input contains an integer C.

Output Format
Print 1 if the triangle having given sides is valid, else print 0.
* */