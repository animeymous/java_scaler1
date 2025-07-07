package Day_9;

public class SumOfEvens {

    //function to calculate sum of evens
    public static int calculateEvenSum(int A){
        int sum = 0;

        for(int i = 1; i <= A; i++){
            if(i % 2 == 0){
                sum+= i;
            }
        }

        return sum;
    }

    //function will just return value from the calculated function
    public int sumOfEvens(int A){
        return calculateEvenSum(A);
    }
}
