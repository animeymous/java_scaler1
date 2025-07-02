package Day_8;

public class SkipEvenNumbersHalfPyramid {
    public void skipEvenNumbersHalfPyramid(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(j % 2 != 0){
                    System.out.print(j);
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
