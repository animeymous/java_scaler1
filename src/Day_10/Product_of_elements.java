package Day_10;

import java.util.Scanner;

public class Product_of_elements {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void printProduct(int [] arr){
        int product = 1;

        for(int i = 0; i < arr.length; i++){
            product *= arr[i];
        }

        System.out.println("Product "+product);
    }
    public void product_of_elements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);
        printProduct(arr);
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
