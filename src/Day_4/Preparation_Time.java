package Day_4;

import java.util.Scanner;

public class Preparation_Time {
    public void preparation_Time(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide no. of layers");
        int layers = sc.nextInt();
        int eachLayer = 2;
        System.out.println("Time to prepare "+layers * eachLayer);
    }
}

/*
Problem Description

You'll write some code to help you cook a gorgeous lasagna from your favorite cookbook. Now, you also want to add a few layers to the lasagna.
Assume **each layer takes 2 minutes** to prepare.
Given the number of layers you want to add to the lasagna, find how many minutes you would spend making them.
Input Format
The only first line contains the integer N denoting the number of layers.
Output Format
Print in a single line how many minutes are required to prepare N layers.
Example Input
Input:-
2
Example Output
Output:-
4
* */