package Day_8;

public class DifferentNumberTriangle {
    public void differentNumberTriangle(int rows){
        int midRowCount = 1;

        for (int i = 1; i <= rows; i++){

            //loop will print 0s
            for(int j = rows - i; j >= 1; j--) System.out.print(0+" ");

            for(int k = 1; k <= midRowCount; k++){
                System.out.print(k * (rows - i + 1) + " ");
            }

            midRowCount = midRowCount + 2; //will increase middle loop count

            //loop will print 0s
            for(int l = rows - i; l >= 1; l--) System.out.print(0+" ");
            System.out.println();
        }
    }
}
