package Day_7;

public class StairPattern {
    public static void stairPattern(int N, int M){
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
