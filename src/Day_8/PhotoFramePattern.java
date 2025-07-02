package Day_8;

public class PhotoFramePattern {
    public void photoFramePattern(int rows){
        for(int i = 1; i <= rows; i++){

            //condition to print full row with *
            if((i == 1) || (i == rows)){
                for(int j = 1; j <= rows; j++){
                    System.out.print("*");
                }
            }else{

                //loop to print middle rows
                for(int k = 1; k <= rows; k++){
                    if((k == 1) || (k == rows)){
                        System.out.print("*");
                    }else{
                        System.out.print("_");
                    }
                }
            }

            System.out.println();
        }
    }
}
