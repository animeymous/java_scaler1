package Day_7;

public class HCF {
    public static int hcf(int A, int B){
        int min = Math.min(A, B);
        int hcfMaxValue = Integer.MIN_VALUE;

        for(int i = 1; i <= min; i++){
            if((A % i == 0) && ((B % i) == 0)){
                hcfMaxValue = i;
            }
        }

        return hcfMaxValue;
    }
}
