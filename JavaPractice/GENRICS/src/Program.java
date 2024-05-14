class Box<T>
{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}
public class Program{
	public static void display(Box<?> b) {
		System.out.println(b.getObj());
	}
	public static void main(String[] args) {
		Box<Integer>b1 = new Box<Integer>();
		b1.setObj(10);
		display(b1);
		
		Box<String>b2 = new Box<String>();
		b2.setObj("hello");
		display(b2);
	}
}
