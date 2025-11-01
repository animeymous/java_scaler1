package Day_13;

import java.util.Scanner;

public class Vowels_vs_Consonants {

    //find vowels and consonants
    public void findVC(String str){
        int coundV = 0;
        int coundC = 0;

        for(int i = 0; i < str.length(); i++){
            char chr = str.charAt(i);

            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' ||chr == 'u'){
                coundV++;
            }else{
                coundC++;
            }
        }

        System.out.println("Vowels "+coundV);
        System.out.println("Consonants "+coundC);
    }
    public void vowels_vs_Consonants(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number of test");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println("Please provide string");
            String str = sc.next();
            findVC(str);
        }
    }
}

/*
Problem Description
Write a program to input T strings (S) from user and print count of vowels and consonants in it.

Problem Constraints
1 <= T <= 100
1 <= S.size() <= 1000

Input Format

First line is T which means number of test cases.
Each next T lines contain a lowercase string S.

Output Format
T lines each containing two space separated integers representing cont of vowels and consonants in input string.
*/
