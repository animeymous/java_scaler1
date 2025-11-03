package Day_15;

import java.util.*;

public class Count_unique_elements {
    //fill array
    public List<Integer> fillArray(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }

        return arr;
    }

    //find count of elements with frequency 1
    public void count(List<Integer> arr){
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.size(); i++){
            if(hashMap.containsKey(arr.get(i))){
                int value = hashMap.get(arr.get(i));

                hashMap.put(arr.get(i), ++value);

            }else{
                hashMap.put(arr.get(i), 1);
            }
        }

        int freq = 0;

        //loop to count and print
        for(int key : hashMap.keySet()){
            if(hashMap.get(key) ==  1){
                freq++;
            }
        }

        System.out.println("Count : "+freq);
    }
    public void count_unique_elements(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide size of array");
        int num = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr = fillArray(arr, num);
        count(arr);

    }
}

/*
Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109

Input Format
First argument A is an array of integers.

Output Format
Return an integer.
*/
