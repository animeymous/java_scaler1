package Day_7;

public class NumericStairPattern {
    public void numericStairPattern(int number){

        //Number of rows
        for(int i = 1; i <= number; i++){
            //variable to print value
            int count = 1;

            //loop to print values
            for(int j = 0; j < i; j++){
                System.out.print(count); //this will print number
                if(j < i - 1) System.out.print(" "); //with this logic, it will add space only between the siblings not at the end
                count++;
            }

            System.out.println();
        }
    }
}
