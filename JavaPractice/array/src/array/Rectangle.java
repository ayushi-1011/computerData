package array;

public class Rectangle {
int length=10;
int breadth=5;
public Rectangle() {
	
}

public Rectangle(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
public void display()
{
	System.out.println("length:"+length+"breadth"+breadth);
	System.out.println("area:"+(length*breadth));
}


}


