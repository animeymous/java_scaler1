package Day_7;

public class PrintMatrixOfStars {
    public static void printMatrixOfStars(int N, int M){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
