package seris;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args){
	
		
		Student student=new Student("kishor","kishor@gmail.com","ktm");
		try (
		//write data into file
		FileOutputStream fos=new FileOutputStream("ab.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);){
		
		//how to serialize
		oos.writeObject(student);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Object stated is transfered to file ab");
		
		

	}

}
