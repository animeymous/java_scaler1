package Day_7;

import java.util.Scanner;

public class Print_a_matrix_of_stars {
    public void print_a_matrix_of_stars(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide number in separate lines");

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int row = 1; row <= N; row++){
            for(int col = 1; col <= M; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
