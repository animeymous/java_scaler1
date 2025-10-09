package Day_4;

import java.util.Scanner;

public class Print_sentence {
    public void print_sentence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide sentence");
        String data = sc.nextLine();
        System.out.println(data);
    }
}

/*
Problem Description
Given an english sentence, take it in the input and print it in the output.
Input Format
Single line containing an english sentence.
Output Format
Print in a single line the sentence in the input.
Example Input
Input 1:
Harry loves Hagrid !
Input 2:
I am a Scaler
Example Output
Output 1:
Harry loves Hagrid !
Output 2:
I am a Scaler
*/