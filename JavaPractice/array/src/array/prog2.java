package array;

public class prog2 {

	public static void main(String[] args) {
		Rectangle[] arr;
		arr = new Rectangle[5];
		arr[0] = new Rectangle();
		arr[1]= new Rectangle(10,20);
		arr[2]= new Rectangle();
		arr[3]=new Rectangle(20,8);
		arr[4]=new Rectangle(25,12);
		
		for (Rectangle element : arr) {
			element.display();
			System.out.println("---------------");
		}
		

	}

}
