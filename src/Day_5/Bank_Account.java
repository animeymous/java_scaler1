package Day_5;

import java.util.Scanner;

public class Bank_Account {
    public void bank_Account(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide bank balance");
        int bankBalance = sc.nextInt();

        System.out.println("Choose operation and provide amount in separate line");

        int operation = sc.nextInt();
        int operationAmount = sc.nextInt();

        if(operation == 1){
            System.out.println(bankBalance + operationAmount);
        }else{
            if (operationAmount <= bankBalance){
                System.out.println(bankBalance - operationAmount);
            }
        }
    }
}

/*
Problem Description
You are given a Bank account having N amount and you are asked to perform ADD(credit) or SUBTRACT(debit) operation of an amount X.

After the operation print the amount left in the Bank account.
If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.

Problem Constraints
1 <= N, X <= 105

Input Format
First line contains a single integer N denoting the balance in bank account.

Next line contains two space separated integers Type and Amount(X).

If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.

Output Format
Print Amount in the bank balance after the operation.
*/
