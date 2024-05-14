
public class prog4 {
public static void main(String[] args) {
	prog03 t1= new prog03();
	try {
		t1.setHr(30);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println(t1);
}
}
