package Day_10;

import java.util.Scanner;

public class Search_Element {
    public int [] insertValues(int [] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void searchElement(int [] arr, int value){
        boolean foundElement = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                foundElement = true;
            }
        }

        if(foundElement == true){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
    public void search_Element(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide integer value for size of array");

        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Please provide value in separate line");
        arr = insertValues(arr);

        System.out.println("Please provide value to search");
        int searchValue = sc.nextInt();
        searchElement(arr, searchValue);
    }
}

/*
Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case.
You have to tell whether B is present in array A or not.

Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109

Input Format

First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:

First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B

Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.
*/
