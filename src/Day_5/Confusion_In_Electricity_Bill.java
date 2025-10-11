package Day_5;

import java.util.Scanner;

public class Confusion_In_Electricity_Bill {
    public void confusion_In_Electricity_Bill(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide electricity units consumed");
        double n = sc.nextDouble();

        if(n >= 250){
            double total = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + (n - 250) * 1.50;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n >= 200 && n < 250){
            double total = (50 * 0.5) + (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }
        else if(n > 150 && n <= 200){
            double total = (50 * 0.5) +  (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n > 100 && n <= 150){
            double total = (50 * 0.5) +  (100 * 0.75) + (n - 150) * 1.20;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n > 50 && n <= 100){
            double total = (50 * 0.5) + (n - 50) * 0.75;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }else if(n <= 50){
            double total = n * 0.5;
            double percentage = (total / 100) * 20;
            System.out.println((int)(total + percentage));
        }
    }
}

/*
Problem Description

Mr. T got the Electricity bill of his house. He felt that the bill amount was too much.
He come to you to understand the relation between amount and number of units with Electricity bill.

Instructions are give on Electricity bill that :
1. For first 50 units Rs. 0.50/unit.
2. For next 100 units Rs. 0.75/unit.
3. For next 100 units Rs. 1.20/unit.
4. For above 250 units Rs. 1.50/unit.
5. An additional surcharge of 20% is added to the bill.

NOTE: As the electricity bill can have any real value (floating point), you have to tell the Integral value of the bill. For eg. Integral value of 2.91 is 2.

To avoid manual calculation again and again, You have to write a code which take number of Unit (suppose N) from user and print the amount.

Problem Constraints
0 < N <= 100000
Input Format
Take an integer N from user
Output Format
Print the amount for that much unit
* */