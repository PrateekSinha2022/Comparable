package Serialization;
import java.io.*;
public class Serialization {
	
	public static void main(String[] args) throws IOException {
		
		Employee e = new Employee(1,"Pal",80000);
		FileOutputStream f = new FileOutputStream("C:\\Users\\User\\Desktop\\kol\\abc.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(e);
		System.out.println("Employee saved to file");
	}

}
