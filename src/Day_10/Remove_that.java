package Day_10;

import java.util.Scanner;

public class Remove_that {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void removeArrayElement(int [] arr, int index){
        //loop to remove element
        for(int i = index-1; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        //print values till 2nd last element
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void remove_that(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];

        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);

        System.out.println("Please provide index to be removed");
        int index = sc.nextInt();
        removeArrayElement(arr, index);

    }
}

/*
Problem Description

Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.

Note:
In this problem, positions are 1-based (the first element is at position 1).
But in most programming languages, arrays/lists are 0-based (the first element is at index 0).
So if the position given is X, you should access it using index X - 1.

Example:
Position = 1 → Index = 0
Position = 3 → Index = 2

Problem Constraints
2 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N

Input Format

First line is N which means number of elements.
Second line contains N space separated integers.
Third line is X position which has to be deleted.

Output Format
N-1 space separated integers of the input array after deleting the element at required position.
*/
