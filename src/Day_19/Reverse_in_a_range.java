package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse_in_a_range {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //reverse
    public void reverse(List<Integer> list, int num1, int num2){

        //use set function not add
        while (num1 < num2){
            int temp = list.get(num1);
            list.set(num1, list.get(num2));
            list.set(num2, temp);
            num1++;
            num2--;
        }

        //print array
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public void reverse_in_a_range(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        System.out.println("Provide range 1");
        int num1 = sc.nextInt();

        System.out.println("Provide range 2");
        int num2 = sc.nextInt();

        reverse(list, num1, num2);
    }
}
