package com.Sunbeam;

import java.util.Scanner;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter employes: ");
			int size = sc.nextInt();
			int n=1;
			int choice;
			int counter = 0;
			Employee[] e1 = new Employee[size];
			System.out.println("enter which salary you need to calculate:");
		System.out.println("1.Commission Employee\n"+"2.Salaried Employee\n"+"3.Hourly Employee\n"+"4.CommissionEmployee\n"+"5.Base Salaried"+"6.display all");
		
		while(n==1) {
			System.out.println("enter choice:");
			choice = sc.nextInt();
				switch(choice) {
			case 1:
				
				
				e1[counter] = new Commission_employee();
				
				e1[counter].accept();
				e1[counter].calculateSalary();
				counter++;
				break;
				
			case 2:
				e1[counter] = new Salaried_Employee();
				e1[counter].accept();
				e1[counter].calculateSalary();
				counter++;
				break;
			case 3:
				e1[counter] = new HourlyEmployee();
				e1[counter].accept();
				e1[counter].calculateSalary();
				counter++;
				break;
			case 4:
				e1[counter] = new Salaried_Employee();
				e1[counter].accept();
				e1[counter].calculateSalary();
				counter++;
				break;
			case 5:
				e1[counter] = new Base_salaried();
				e1[counter].accept();
				e1[counter].calculateSalary();
				counter++;
				break;
			case 6:
				for(Employee e2:e1)
				{
					System.out.println(e2.toString());
					e2.calculateSalary();
					
				}
				break;
			}
		
		
		}
		
	}

}
