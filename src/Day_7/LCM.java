package Day_7;

public class LCM {
    public static int lcm(int A, int B){
        int min = Math.min(A, B);
        int lcmvalue = 0;

        for(int i = 1; i <= min; i++){
            if((A % i == 0) && (B % i == 0)){
                lcmvalue = i;
            }
        }

        return lcmvalue;
    }
}
