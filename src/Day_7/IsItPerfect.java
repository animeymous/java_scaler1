package Day_7;

public class IsItPerfect {
    public static boolean isItPerfect(int number){
        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }

        return sum == number;
    }
}
