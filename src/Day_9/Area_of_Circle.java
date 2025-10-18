package Day_9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Area_of_Circle {

    public double calculate_area_of_circle(int A){
        // Calculate the area of the circle
        double area = Math.PI * A * A;

        // Create a BigDecimal from the area
        BigDecimal bd = new BigDecimal(area);

        // Round to 2 decimal places
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public void area_of_Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();
        double area = calculate_area_of_circle(num);
        System.out.println("Area of circle "+ area);
    }
}

/*
Problem Description

You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.

Note :

The formula for the area of a circle is Area = πr², where r is the radius of the circle.
You can use the value of PI as 3.1416
Round up the final answer up to 2 decimal places.
You can use round(area, 2) it for rounding area to 2 decimal places

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is an integer A.

Output Format
Return final answer upto 2 decimal places, denoting the area of the circle.
*/
