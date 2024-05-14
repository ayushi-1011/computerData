package fileprac;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Prog1 {
public static void main(String[] args) {
	try(FileInputStream fis = new FileInputStream("file1.txt")){
		try(ObjectInputStream ois = new ObjectInputStream(fis)){
			Employee e = (Employee)ois.readObject();
			System.out.println(e);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
