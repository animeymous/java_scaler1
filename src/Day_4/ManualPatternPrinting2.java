package Day_4;

public class ManualPatternPrinting2 {
    public void manualPatternPrinting2(){
        for(int i = 1; i <= 5; i++){
            for(int k = 5 - i; k >= 1; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Print the following pattern in output

    *
   **
  ***
 ****
*****

*/