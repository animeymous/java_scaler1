package Day_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Good_Pair {
    //fill array
    public List<Integer> fillArray(List<Integer> list, int size){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide values");
        for(int i = 0; i < size; i++){
            list.add(scanner.nextInt());
        }
        return list;
    }

    //find pair
    public void findPair(List<Integer> list, int num){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i == j){
                    continue;
                } else if (list.get(i) + list.get(j) == num) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
        return;
    }

    public void good_Pair(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide size of array");
        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list = fillArray(list, size);

        System.out.println("Provide number");
        int num = sc.nextInt();

        findPair(list, num);
    }
}

/*
Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.

Problem Constraints
1 <= A.size() <= 104
1 <= A[i] <= 109
1 <= B <= 109

Input Format
First argument is an integer array A.
Second argument is an integer B.

Output Format
Return 1 if good pair exist otherwise return 0.
*/
