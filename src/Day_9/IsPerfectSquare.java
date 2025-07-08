package Day_9;

public class IsPerfectSquare {

    //function to calculate perfect square
    public static int calculatePerfectSquare(int A){

        if(A <= 0){
            return 0;
        }
        double squareRoot = Math.sqrt(A);

        if(squareRoot * squareRoot == A){
            return 1;
        }else{
            return 0;
        }
    }

    // wrapper function
    public int isPerfectSquare(int A){
        return calculatePerfectSquare(A);
    }

}
