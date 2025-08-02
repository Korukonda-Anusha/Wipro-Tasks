package day11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args) throws IOException {
	
		
		 
        BufferedWriter br=new BufferedWriter(new FileWriter("Hello.txt"));
        		br.write("hi good morning welcome to java programming  this widely used ");
        		br.close();
        		System.out.println("Entered Successfully");
	}

}