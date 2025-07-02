package Day_7;

public class InvertedHalfPyramid {
    public void invertedHalfPyramid(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = rows; j - i >= 1; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
