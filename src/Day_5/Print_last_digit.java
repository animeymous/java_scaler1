package Day_5;

import java.util.Scanner;

public class Print_last_digit {
    public void print_last_digit(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide number");

        int a = sc.nextInt();
        int lastDigit = a%10;
        System.out.println("Last Digit "+lastDigit);
    }
}
