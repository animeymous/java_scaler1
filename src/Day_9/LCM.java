package Day_9;

public class LCM {

    //function to calculate lcm for the give two values
    public static int calculateLcm(int A, int B){
        int lcmValue = 0;

        for(int i = 2; true ; i++){
            if((i % A == 0) && (i % B == 0)){
                lcmValue = i;
                break; // we don't need to iterate more since already got minimum
            }
        }

        return lcmValue;
    }

    //wrapper function
    public int lcm(int A, int B){
        return calculateLcm(A, B);
    }
}
