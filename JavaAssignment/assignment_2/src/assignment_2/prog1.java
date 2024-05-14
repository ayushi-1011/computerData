package assignment_2;

import java.util.Scanner;

public class prog1 {
	
public static void main(String[] args) {
	int account_number;
	int item_charged;
	int credit;
	int balance;
	int new_balance;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter account credit:");
	account_number = sc.nextInt();
	System.out.println("enter item charged:");
	item_charged = sc.nextInt();
	System.out.println("enter credit:");
	credit =sc.nextInt();
	System.out.println("enter balance:");
	balance = sc.nextInt();
	new_balance = balance+(item_charged-credit);
	System.out.println("new balance:"+new_balance);
	
	
	if(new_balance>25000)
	{
		System.out.println("Credit limit exceeded");
	}
	else
	{
		System.out.println("allowed limit");
	}
}
}
