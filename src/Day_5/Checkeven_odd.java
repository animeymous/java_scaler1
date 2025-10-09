package Day_5;

import java.util.Scanner;

public class Checkeven_odd {
    public void checkeven_odd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number");

        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
