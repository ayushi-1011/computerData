package com.sunbeam;
import java.util.Scanner;

public class Array {
	int name;
	public static void main(String[] args)
	{
		int arr_size = 0;
	
		Scanner sc = new Scanner(System.in);
       // Take the array size from the user
		System.out.println("Enter the size of the array: ");
		
		arr_size = sc.nextInt();
		

		// Initialize the array's
		// size using user input
		String[] name = new String[arr_size];

		// Take user elements for the array
		System.out.println(
			"Enter the elements of the array: ");
		for (int i = 0; i < arr_size; i++) {
			System.out.println("enter name:");
				name[i] = sc.next();
			}
		

		System.out.println(
			"The elements of the array are: ");
		for (int i = 0; i < arr_size; i++) {
			// prints the elements of an array
			System.out.print(name[i] + " ");
		}
		sc.close();
	}
}
