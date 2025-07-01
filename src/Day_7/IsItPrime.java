package Day_7;

public class IsItPrime {

    public static int count = 1;

    public boolean isItPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                count++;
            }
        }

        return count <= 1;
    }
}
