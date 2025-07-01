package Day_7;

public class CountFactors {
    int count = 1;

    public int countfactors(int number){
        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        return count;
    }
}
