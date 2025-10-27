package Day_13;

import java.util.Scanner;

public class Last_Occurrence {
    //find occurrence
    public void findOccurrence(String str, int num){
        int index = -1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == num){
                index = i; // will take last occurrence
            }
        }

        if(index != -1){
            System.out.println("Index of first occurrence "+index);
        }else{
            System.out.println("Not found -1");
        }

    }
    public void last_Occurrence(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide string");
        String str = sc.next();

        System.out.println("Please prove character to find in integer format");
        int num = sc.nextInt();
        findOccurrence(str, num);
    }
}

/*

*/
