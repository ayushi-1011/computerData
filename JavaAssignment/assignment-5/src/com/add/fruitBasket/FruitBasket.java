package com.add.fruitBasket;

import java.util.Scanner;

import com.add.fruit.Apple;
import com.add.fruit.Fruit;
import com.add.fruit.Mango;
import com.add.fruit.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		int basketSize, counter = 0;
		int choice, index;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of basket: ");
		basketSize = sc.nextInt();
		Fruit[] basket = new Fruit[basketSize];
		
		
		do {
			System.out.println("0. Exit\n"
					+ "1. Add Mango\n"
					+ "2. Add Orange\n"
					+ "3. Add Apple\n"
					+ "4. Display all fruits in basket\n"
					+ "5. Display name, color, weight of all fresh fruit\n"
					+ "6. Mark a fruit as stale\n"
					+ "7. Display taste of all stale fruites\n"
					+ "8. Mark all fruits stale\n"
					+ "Enter your choice:");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 0:
				break;
			case 1:
				if(counter < basketSize) {
					System.out.println("Enter weight: ");
					weight = sc.nextDouble();
					basket[counter] = new Mango("Mango", weight, "Yellow");
					counter++;
				}
				else {
					System.out.println("Basket is Full...");
				}
				break;
			case 2:
				if(counter < basketSize) {
					System.out.println("Enter weight: ");
					weight = sc.nextDouble();
					basket[counter] = new Orange("Orange",weight,"orange");
					counter++;
				}
				else {
					System.out.println("Basket is Full...");
				}
				break;
			case 3:
				if(counter < basketSize) {
					System.out.println("Enter weight: ");
					weight = sc.nextDouble();
					basket[counter] = new Apple("Apple", weight, "Red");
					counter++;
				}
				else {
					System.out.println("Basket is Full...");
				}
				break;
			case 4:
				System.out.println("Fruites in Basket are: ");
				for(Fruit fruit:basket) {
					if(fruit == null) {
						break;
					}
					System.out.println(fruit.getName());
				}

				break;
			case 5:
				System.out.println("Fresh fruites in Basket are: ");
				for(Fruit fruit:basket) {
					if(fruit != null) {
						if(fruit.isFresh()) {
							fruit.toString();
							System.out.println(fruit.toString()+", Taste= " + fruit.taste()+", is fresh= "+fruit.isFresh());
						}
					}
				}
				break;
			case 6:
				System.out.println("No. of fruits in basket: "+counter);
				System.out.println("Enter index: ");
				index = sc.nextInt();
				basket[index-1].setFresh(false);
				break;
			case 7:
				System.out.println("Taste of stale fruites in Basket are: ");
				for(Fruit fruit:basket) {
					if(fruit != null) {
						if(!fruit.isFresh()) {
							System.out.println(fruit.taste()+", ");
						}
					}
				}
				break;
			case 8:
				for(int i=0; i<counter; i++) {
					basket[i].setFresh(false);
				}
				break;
			default:
				System.out.println("Enter valid choice...");
				break;
			}			
		}while(choice != 0);		
		
	}
}
