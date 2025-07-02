package Day_7;

public class PrintThePrimes {

    public static boolean isPrime(int number){
        int countFactors = 0;

        //Since 1 is not prime, we are removing it directly
        if (number == 1){
            return false;
        }

        //Since 2 is smallest prime so we return it directly
        if(number == 2){
            return true;
        }

        //Since any even number cannot be a prime number apart from 2, we will ignore them
        if(number % 2 == 0){
            return false;
        }

        //We will run this loop till equal square too of the number, if count remain 0 means its prime
        for(int i = 3; i * i <= number; i +=2){
            if(number % i == 0){
                countFactors++; //Example: 100, sqr root : 10, in that case it should increase, so 100 is also not Prime
            }
        }

        return countFactors < 1;
    }

    public void printThePrimes(int range){
        for(int i = 1; i <= range; i++){
            System.out.println(isPrime(i) + " "+ i);
        }
    }
}
