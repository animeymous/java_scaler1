package Day_9;

public class CountOfPrimes {

    //function to check if a number is prime or not
    public static boolean isPrime(int A){
        if (A < 2) return false; // treat any number below 2 as not prime1`
        if(A == 2) return true; // since 2 is prime no need to run loop for it
        if(A % 2 == 0) return false; // removed even numbers immediately

        for(int i = 3; i * i<= A; i = i+2){ // loop starts from 3 and ignoring even number by increasing it by 2
            if(A % i == 0) return false; //return as soon as find any factor
        }

        return true;
    }

    //function to count primes
    public static int countPrimes(int A){
        int countPrime = 0;

        for(int i  = 2; i <= A; i++){
            boolean result = isPrime(i);
            if(result) {
                countPrime++;
            }
        }

        return countPrime;
    }
    //main function to return value
    public int countOfPrimes(int A) {
        return countPrimes(A);
    }
}
