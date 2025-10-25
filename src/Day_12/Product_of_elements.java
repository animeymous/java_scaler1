package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_of_elements {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    //function of find product of element
    public void findProduct(List<Integer> arr){
        int product = 1;

        for(int i = 0; i < arr.size(); i++){
            product *= arr.get(i);
        }

        System.out.println("Product "+product);
    }
    public void product_of_elements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>(num);
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr, num);
        findProduct(arr);

    }
}

/*
Problem Description:

Write a program that returns the product of all elements present in the array.

Note: The list with elements is already passed as an argument to the function. User don't need to take any input.
Just perform the task on the passed arguments and return the required result.

Constraints:

1 <= |A| <= 100
1 <= A <= 100
Note: It is guaranteed that the resultant product will be <= 1015
Input Format:

An integer array **A** as the function argument.
Output Format:

Product of elements in integer format
*/
