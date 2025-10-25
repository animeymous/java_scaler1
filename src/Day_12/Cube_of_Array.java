package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cube_of_Array {
    //function to insert values in array list
    public List<Integer> insertValues(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }
        return arr;
    }

    //function to find cube
    public void findCube(List<Integer> arr){
        List<Long> cubeProduct= new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            long product = (long)arr.get(i) * arr.get(i) * arr.get(i);
            cubeProduct.add(product);
        }

        for(int i = 0; i < cubeProduct.size(); i++){
            System.out.print(cubeProduct.get(i)+" ");
        }
    }
    public void cube_of_Array(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>(num);
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr, num);
        findCube(arr);
    }
}

/*
Problem Description
You are provided with an integer array A. Return another array B of size same as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).

Problem Constraints
1 <= |A| <= 106
1 <= A[i] <= 106

Input Format
The first and only argument is an integer array A.

Output Format
Return array B.
*/
