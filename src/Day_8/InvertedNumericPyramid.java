package Day_8;

public class InvertedNumericPyramid {
    public void invertedNumericPyramid(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
