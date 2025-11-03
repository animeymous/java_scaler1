package Day_15;

import java.util.*;

public class Frequency_of_element_query {
    //fill array
    public List<Integer> fillArray(List<Integer> arr, int num){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num; i++){
            arr.add(sc.nextInt());
        }

        return arr;
    }

    //frequency of each array in query
    public void freqencyOfEachQuery(List<Integer> arr1, List<Integer> arr2){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        //create hashmap to store frequency of elements
        for(int i = 0; i < arr1.size(); i++){
            if(hashMap.containsKey(arr1.get(i))){
                int value = hashMap.get(arr1.get(i));
                hashMap.put(arr1.get(i), ++value);
            }else{
                hashMap.put(arr1.get(i), 1);
            }
        }

        // check each element's frequency in hashmap
        for(int i = 0; i < arr2.size(); i++){
            if(hashMap.containsKey(arr2.get(i))){
                result.add(hashMap.get(arr2.get(i)));
            }
        }

        //print array
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
    }

    public void frequency_of_element_query(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide size of first array");
        int num = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr = fillArray(arr, num);

        System.out.println("Please provide size of second array");
        int num2 = sc.nextInt();

        List<Integer> arr2 = new ArrayList<>();
        arr2 = fillArray(arr2, num2);

        freqencyOfEachQuery(arr, arr2);
    }
}

/*
Problem Description

SCALER organizes a series of contests aimed at helping learners enhance their coding skills. Each learner can participate in multiple contests,
and their participation is represented by integers in an array. The goal is to identify how frequently each learner has participated in these contests.
This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.


Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner,
and an array B containing the learners for whom you want to check participation frequency,
your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies

Problem Constraints

1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105

Input Format
First argument A is an array of integers.
Second argument B is an array of integers denoting the queries.

Output Format
Return an array of integers containing the frequency of each learner in B as found in array A.
*/