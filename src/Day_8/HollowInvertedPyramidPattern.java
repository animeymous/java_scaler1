package Day_8;

public class HollowInvertedPyramidPattern {
    public void hollowInvertedPyramidPattern(int rows){
        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int k = 1; k <= (rows-i)*2; k++) System.out.print("_");
            for (int l = 1; l <= i; l++) System.out.print("*");
            System.out.println();
        }
    }
}
