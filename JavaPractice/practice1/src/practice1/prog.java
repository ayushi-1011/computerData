package practice1;

import java.util.Scanner;

public class prog {
public static void main(String[] args)
{
	int empid;
	String name;
	double salary;

Scanner sc = new Scanner(System.in);

System.out.println("enter id-");
empid=sc.nextInt();
System.out.print("enter empname-");
name = sc.nextLine();
System.out.print("enter salary");
salary = sc.nextDouble();

System.out.println("empno"+name);
}

}
