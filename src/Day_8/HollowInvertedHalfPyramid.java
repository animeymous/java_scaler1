package Day_8;

public class HollowInvertedHalfPyramid {
    public void hollowInvertedHalfPyramid(int rows){
        for(int i = rows; i >= 1; i--){

            if(i == rows){
                for(int j = 1; j <= rows; j++){
                    System.out.print("*");
                }
            }else if(i > 1){

                //loop to print white spaces in the middle and at the corners *
                for (int k = 1; k <= i; k++){
                    if((k == 1) || k == i) System.out.print("*");
                    else System.out.print("_");
                }
            }

            // this will print single * when the rows value is just 1
            if(i == 1) System.out.print("*");
            System.out.println();
        }
    }
}
