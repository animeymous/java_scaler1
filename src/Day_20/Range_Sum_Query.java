package Day_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Range_Sum_Query {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //user input array
    public List<List<Integer>> userInput(int num){
        List<List<Integer>> userInput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide index range in A, B format");
        for(int i = 0; i < num; i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < 2; j++){
                temp.add(scanner.nextInt());
            }

            userInput.add(temp);
        }

        return userInput;
    }

    //create prefix sum
    public List<Integer> createPrefixSum(List<Integer> arr){
        List<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr.get(0));

        for(int i = 1; i < arr.size(); i++){
            prefixSum.add(prefixSum.get(i - 1)+ arr.get(i));
        }

        return prefixSum;
    }

    //range sum
    public void rangeSum(List<Integer> arr, List<List<Integer>> userInput){
        List<Integer> prefixSum = createPrefixSum(arr);
        List<Long> result = new ArrayList<>();

        for(int i = 0; i < userInput.size(); i++){
            int left = userInput.get(i).get(0);
            int right = userInput.get(i).get(1);
            long sum = 0;

            if(left == 0){
                sum = prefixSum.get(right);
            }else {
                sum = prefixSum.get(right) - prefixSum.get(left - 1);
            }

            result.add(sum);
        }

        //print result
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
    }

    public void range_Sum_Query(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide size of array");
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        System.out.println("How many range want to test");
        int num = scanner.nextInt();

        List<List<Integer>> userInput = userInput(num);
        rangeSum(list,userInput);

    }
}

/*
Problem Description

You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.
*/
