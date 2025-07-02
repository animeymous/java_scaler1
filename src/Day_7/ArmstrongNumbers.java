package Day_7;

public class ArmstrongNumbers {
    public void armstrongNumbers(int range){

        for(int i = 1; i <= range; i++){
            int num = i;
            int sum = 0;
            while(num > 0){
                int temp = num % 10;
                int mul = temp * temp * temp;
                sum = sum + mul;
                num = num / 10;
            }

            if (sum == i){
                System.out.println(sum);
            }
        }
    }
}
