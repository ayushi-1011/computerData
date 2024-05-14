package invoicetest;

import java.util.Scanner;

public class Invoice {
private String part_number = "";
private String part_description="";
private int qty=0;
private double price_per_item=0.0;
private double invoice_amount=0.0;
 public Invoice() {}


public Invoice(String part_number, String part_description,int qty,double price_per_item) {
	 this.part_number = part_number;
	 this.part_description=part_description;
	 this.qty=qty;
	 this.price_per_item=price_per_item;
}
public String getPart_number() {
	return part_number;
}
public void setPart_number(String part_number) {
	this.part_number = part_number;
}
public String getPart_description() {
	return part_description;
}
public void setPart_description(String part_description) {
	this.part_description = part_description;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice_per_item() {
	return price_per_item;
}
public void setPrice_per_item(double price_per_item) {
	this.price_per_item = price_per_item;
}
Scanner sc = new Scanner(System.in);
public void accept() {
	System.out.println("enter part number");
	part_number = sc.next();
	System.out.println("enter part_description");
	part_description= sc.next();
	System.out.println("enter qty");
	qty = sc.nextInt();
	if(qty<0)
	{
		qty = 0;
	}
	System.out.println("enter price per item");
	price_per_item = sc.nextDouble();
	if(price_per_item<0) {
		price_per_item = 0.0;
	}
}
public void getInvoice() {
	invoice_amount = qty*price_per_item;
	System.out.println("Invoice amount:"+invoice_amount);
}


}
