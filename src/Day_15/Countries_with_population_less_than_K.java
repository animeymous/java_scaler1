package Day_15;

import java.util.*;

public class Countries_with_population_less_than_K {
    //fill array
    public List<Map<String, Integer>> fillArray(List<Map<String, Integer>> arr, int num){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num; i++){
            Map<String, Integer> temp = new HashMap<>();

            System.out.println("Please provide country name");
            String str = sc.next();

            System.out.println("Please provide country's number");
            int number = sc.nextInt();

            temp.put(str, number);

            arr.add(temp);
        }

        return arr;
    }

    //function to print countries below k
    public void calculate(List<Map<String, Integer>> list, int k){
        int count = 0;

        for(int i = 0; i < list.size(); i++){
            for(String country : list.get(i).keySet()){
                if(list.get(i).get(country) < k){
                    count++;
                }
            }
        }

        System.out.println("Count "+count);
    }

    public void countries_with_population_less_than_K(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide size of array");
        int num = sc.nextInt();

        List<Map<String, Integer>> list = new ArrayList<>();
        list = fillArray(list, num);

        System.out.println("Please provide number for K");
        int k = sc.nextInt();

        calculate(list, k);

    }
}

/*
Problem Description
You are given a Hashmap<String, int> H and an integer K as a function input.
The hashmap stores the name of some countries and the corresponding population.
Return the number of countries with a population less than K.

Problem Constraints
1 <= Length of H <= 105

Input Format
First argument is the hashmap H.
Second argument K is an integer.

Output Format
Return an integer denoting the number of countries with population less than K
*/
