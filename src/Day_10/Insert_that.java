package Day_10;

import java.util.Scanner;

public class Insert_that {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void inserThat(int [] arr, int [] newArr, int index, int value){

        for(int i = 0; i < newArr.length; i++){
            if(i < index){
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[index] = value;
            }else {
                newArr[i] = arr[i - 1];
            }
        }

        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
    }
    public void insert_that(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        int [] newArr = new int[num + 1];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);

        System.out.println("Please provide index");
        int index = sc.nextInt();

        System.out.println("Please provide value in separate line");
        int value = sc.nextInt();

        inserThat(arr, newArr, index, value);


    }
}

/*
Problem Description

Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X.
X is based on 1-based indexing
Note: When an element is inserted at position X, all elements that were already present at position >= X,
gets shifted to one position right, not replaced.

Problem Constraints

1 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N
1 <= Y <= 1000

Input Format

First line is N which represents number of elements.
Second line contains N space separated integers.
Third line is X position where Y has to be inserted.
Fourth line is Y which is the value to be inserted.

Output Format
N+1 space separated integers of the input array after inserting the element at required position.
*/