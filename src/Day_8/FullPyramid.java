package Day_8;

public class FullPyramid {
    public void fullPyramid(int rows){
        for(int i = 1; i <= rows; i++){

            //loop to print white spaces
            for(int j = rows - i; j >= 1; j--){
                System.out.print(" ");
            }

            //loop to print *
            for (int k = 1; k <= i; k++){
                System.out.print("*");
                if(k <= i){ // this will restrict loop to print unnecessary space the end
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
