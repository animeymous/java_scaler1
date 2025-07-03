package Day_8;

public class InvertedFullPyramidSolved {
    public void invertedFullPyramidSolved(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("_");
            }
            for(int k = rows-i; k >= 1; k--){
                System.out.print("_");
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
