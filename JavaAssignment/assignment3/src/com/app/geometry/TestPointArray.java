
import java.util.Scanner;
import com.app.geometry.*;

public class TestPointArray {

	public static void main(String[] args) {
		
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of points to add: ");
		int numPoints = sc.nextInt();
		Point2D[] points = new Point2D[numPoints];
		for (int i = 0; i < numPoints; i++) {
	          points[i] = new Point2D();
	          System.out.println("Enter X Coordinate");
	          float x = sc.nextFloat();
	          points[i].setX(x);
	          System.out.println("Enter Y Coordinate");
	          float y= sc.nextFloat();
	          points[i].setY(y);
	      }
		int choice = 0;
		while(choice!=4) {
			System.out.println("\n-------------------------------------");
			System.out.println("Press 1 to display details. \n"
					+ "Press 2 to display coordinates of all points \n"
					+ "Press 3 to find distance between points.\n"
					+ "Press 4 to Exit.");
			 choice = sc.nextInt();
			 System.out.println("-------------------------------------\n");
			switch(choice) {
			case 1: 
				System.out.print("Enter index of Element to Access: ");
				int index = sc.nextInt();
				if(index>=points.length) {
					System.out.println("Invalid Index, Please Retry");
				}
				else {
					points[index].getString();
					}
				break;
			case 2: for(Point2D all :points) {
					all.getString();
					}
				break;
			case 3:
				System.out.println("Enter start point and end point");
				int start = sc.nextInt();
				int end = sc.nextInt();
				if(start>=points.length||end>=points.length) {
					System.out.println("Enter Valid Indexes.");
				}
				else {
					if(Point2D.isEqual(points[start], points[end])) {
						System.out.println("Points are at same position");
					}
					else {
						System.out.println(Point2D.calculate(points[start], points[end])); 
					}
				}
				break;
			case 4: System.out.println("Thank You");
				break;
				default: System.out.println("Invalid Request");
				break;
			}
		}
	}

}}