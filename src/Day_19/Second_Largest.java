package Day_19;

import java.util.*;

public class Second_Largest {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //find second largest
    public void findSecondLargest(List<Integer> list){
        if(list.size() < 2){
            System.out.println(-1);
            return;
        }

        Integer largest = null;
        Integer secondLargest = null;

        for(int num : list){
            if(largest == null || num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest != null ? secondLargest : -1);
    }
    public void second_Largest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        findSecondLargest(list);
    }
}

/*
Problem Description

You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format
The first argument is an integer array A.

Output Format
Return the second largest element. If no such element exist then return -1.
*/
