package Day_8;

public class HalfDiamond {
    public void halfDiamond(int rows){
        for(int i = 1; i < (rows * 2)-1; i++){
            if(i <= rows){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                //loop to print * after above loop reach its half iteration
                for (int k = ((rows * 2)-1) - i; k >= 1; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
//        second approach: added two separate outer loop

//        for(int i = 1; i < rows; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int k = rows - 1 ; k>= 0; k--){
//            for(int l = k; l >= 0; l--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
