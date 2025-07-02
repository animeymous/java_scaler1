package Day_8;

public class HollowPyramidPattern {
    public void hollowPyramidPattern(int rows){
        for(int i = 0; i < rows; i++){
            for (int j = rows - i; j >= 1; j-- ) System.out.print("*");
            for (int k = 0; k < i*2; k++) System.out.print("_");
            for (int l = rows - i; l >= 1; l--) System.out.print("*");
            System.out.println();
        }
    }
}
