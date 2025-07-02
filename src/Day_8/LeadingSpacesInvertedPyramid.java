package Day_8;

public class LeadingSpacesInvertedPyramid {
    public void leadingSpacesInvertedPyramid(int rows){
        for(int i = 0; i < rows; i++){

            //loop to print white spaces
            for(int j = 0; j < i; j++){
                System.out.print("_");
            }

            //loop to print *
            for(int k = rows - i; k >= 1; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
