package assignment1;

import java.util.Scanner;

public class prog {


	public static void main(String[] args) {
		double num1,num2,avg;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a num");
	
	
 if(sc.hasNextDouble())
		 {
	 num1=sc.nextDouble();
	 System.out.print("enter num2");
	 if(sc.hasNextDouble())
	 {
		 num2= sc.nextDouble();
		 avg = (num1+num2)/2;
		 System.out.print("avg="+avg);
	 }
	
		 }
}
}
