package Day_8;

import java.util.Scanner;

public class Leading_spaces_inverted_pyramid {
    public void leading_spaces_inverted_pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            //print spaces
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            //print stars
            for(int k = 0; k < num - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Problem Constraints
1 <= N <= 100

Input Format
First and only line of input contains a single integer N.

Output Format
Output the pattern corresponding to the given N.
*/
