package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pic {
	
	public static void main(String[] args) throws IOException {
		
		String image = "C:\\Users\\User\\Downloads\\rasgulla.jpg";
		Path path=Paths.get(image);
		
		byte[] byteArray = Files.readAllBytes(path);
		FileOutputStream f=new FileOutputStream("C:\\Users\\User\\Desktop\\kol\\image.jpg");
		f.write(byteArray);
		System.out.println("Image saved");
	}

}
