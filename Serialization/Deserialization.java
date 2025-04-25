package Serialization;
import java.io.*;
public class Deserialization {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream f = new FileInputStream("C:\\Users\\User\\Desktop\\kol\\abc.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		Employee e =(Employee) o.readObject();
		System.out.println(e.getSalary());
	}

}
