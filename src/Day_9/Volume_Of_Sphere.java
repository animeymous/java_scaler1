package Day_9;

import java.util.Scanner;

public class Volume_Of_Sphere {

    public int calculate_Volume_Of_Sphere(int A){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(A, 3);
        double ceilingValue = Math.ceil(volume);
        int result = (int) ceilingValue;
        return result;
    }
    public void volume_Of_Sphere(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();
        int ceilValue = calculate_Volume_Of_Sphere(num);
        System.out.println(ceilValue);
    }
}

/*
Problem Description

You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.
Volume of a sphere having radius R is given by (4 * π * R3) / 3.

NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume.
Ceil value of a real number X is the smallest integer that is greater than or equal to X.

Problem Constraints
1 <= A <= 400

Input Format
First and only argument is an integer A.

Output Format
Return a single integer denoting the ceil value of volume of the sphere.
*/
