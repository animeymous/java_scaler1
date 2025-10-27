import java.util.Scanner;

public class First_Occurrence {
    //fint occurrence
    public void findOccurrence(String str, int num){
        int charCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == num){
                charCount++;
            }
        }

        if (charCount > 0){
            System.out.println("Character count "+charCount);
        }else {
            System.out.println(-1);
        }

    }
    public void first_Occurrence(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide string");
        String str = sc.next();

        System.out.println("Please prove character to find in integer format");
        int num = sc.nextInt();
        findOccurrence(str, num);
    }
}

/*
Problem Description
You are given a character string A, having length N and an integer ASCII code B.
You have to tell the leftmost occurrence of the character having ASCII code equal to B, in A or report that it does not exist.

Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z']
97 <= B <= 122

Input Format
First argument is a character string A.
Second argument is an integer B.

Output Format
If there exists an occurrence, return the leftmost index(0 - based), else return -1.
*/
