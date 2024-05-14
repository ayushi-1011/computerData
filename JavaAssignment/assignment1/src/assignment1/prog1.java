package assignment1;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
	int choice;
	int bill = 0;
	int qty;
	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("1.dosa:50"+'\n'+"2.idli:20"+'\n'+"3.samosa:15"+'\n'+"4.poha:15");
	System.out.println("enter choice:");
	choice = sc.nextInt();
	 
	switch(choice) {
	case 1:
		System.out.println("enter qty=");
		qty = sc.nextInt();
		bill = bill+(qty*50);
		break;
	case 2:
		System.out.println("enter qty=");
		qty = sc.nextInt();
		bill = bill+(qty*20);
		break;
	case 3:
		System.out.println("enter qty=");
		qty = sc.nextInt();
		bill = bill+(qty*15);
		break;
	case 4:
		System.out.println("enter qty=");
		qty = sc.nextInt();
		bill = bill+(qty*15);
		break;
	case 5:
		System.out.println("bill="+bill);
		break;
	
	}
	if(choice==0)
		break;
	}
	}
		

	}


