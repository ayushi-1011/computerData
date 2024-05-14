package assignment_2;

import java.util.Scanner;

public class prog2 {
public static void main(String[] args) {
	int total_miles;
	int cost_per_gallon;
	int avg_per_gallon;
	int parking_fees;
	int tolls;
	int petrol_price;
	float total_cost;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter total miles:");
	total_miles= sc.nextInt();
	System.out.println("enter cost per gallon");
	cost_per_gallon = sc.nextInt();
	System.out.println("enter avg_per_gallon");
	avg_per_gallon = sc.nextInt();
	System.out.println("enter parking_fees");
	parking_fees = sc.nextInt();
	System.out.println("enter tolls");
	tolls = sc.nextInt();
	petrol_price = (total_miles/avg_per_gallon)*cost_per_gallon;
	System.out.println("Total petrol price:"+petrol_price);
	total_cost = petrol_price + parking_fees+tolls;
	System.out.println("total cost :"+total_cost);
	
	
	
	
	
}

}
