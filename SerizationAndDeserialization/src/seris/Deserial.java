package seris;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			FileInputStream fis=new FileInputStream("ab.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student student=(Student) ois.readObject();
			student.display();
			
			
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
