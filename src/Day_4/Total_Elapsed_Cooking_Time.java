package Day_4;

import java.util.Scanner;

public class Total_Elapsed_Cooking_Time {
    public void total_Elapsed_Cooking_Time(){
        Scanner sc = new Scanner(System.in);
        int eachLayer = 2;
        System.out.println("Please provide number of layers");
        int numberOfLayer = sc.nextInt();
        System.out.println("Please provide number of mints lasagna in oven");
        int bakingInOven = sc.nextInt();
        System.out.println("Total Elapsed time "+((eachLayer*numberOfLayer)+bakingInOven));
    }
}

/*
Problem Description

You wrote some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you want to find the total number of minutes you've been cooking for the sum of your preparation time and the time the lasagna has already spent baking in the oven.
The preparation time of one layer is 2 minutes. Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven,
find the total elapsed cooking time (prep + bake) in minutes.

Problem Constraints

1 <= N <= 20
0 <= M <= 40
Input Format

There are 2 lines in the input.
The first line contains the integer N denoting the number of layers.
The second line contains the integer M denoting the time the lasagna has already spent baking in the oven.

Output Format

Print in a single line the total elapsed cooking time.
*/
