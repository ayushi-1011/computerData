import java.util.InputMismatchException;
import java.util.Scanner;

public class prog1 {
public static void division(int num,int den) {
	System.out.println("division-"+(num/den));
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter value for num:");
			int num=sc.nextInt();
			System.out.println("enter den:");
			int den = sc.nextInt();
			division(num,den);
			}catch(ArithmeticException | InputMismatchException e) {
				e.printStackTrace();
			}
System.out.println("program finished");
	}

}
