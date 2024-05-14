package invoicetest;

public class Tester {
public static void main(String[] args) {
	Invoice i1 = new Invoice("book","showbook",5,10.20);
	i1.accept();
	i1.getInvoice();
}
}
