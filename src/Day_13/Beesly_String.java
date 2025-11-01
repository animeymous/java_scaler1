package Day_13;

import java.util.Scanner;

public class Beesly_String {

    //function to check string can be empty or not
    public void check(String A){
        int p = 0;
        int a = 0;
        int m = 0;

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'p'){
                p++;
            }else if(A.charAt(i) == 'a'){
                a++;
            }else{
                m++;
            }
        }

        if((a + p) == m){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
    public void beesly_String(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide string");

        String str = sc.next();

        check(str);
    }
}

/*
Problem Description

Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers.
The string consists of lowercase latin letters 'p','a' and 'm' only.

In one wish, Mr Jim can perform one of the following operations:
Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.
Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0.

Problem Constraints
1 ≤ |A| ≤ 105

Input Format
The first argument is a string, A.

Output Format
Return 1, if it is possible to make string A empty. Otherwise return 0.
*/
