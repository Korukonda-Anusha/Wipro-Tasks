package daySix;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_Csv {

	public static void main(String[] args) {
		 File f1 = new File("data.csv");
	     BufferedReader br1 = null;
	     String line;
	
	 try {
         br1 = new BufferedReader(new FileReader(f1));
         while ((line = br1.readLine()) != null) {
             // Print each line from the CSV
             System.out.println("CSV Row: " + line);
             
             // Optional: split by comma
             String[] values = line.split(",");
             for (String value : values) {
                 System.out.println(" - " + value.trim());
             }
         }
     } catch (FileNotFoundException e) {
         System.out.println("File not found error");
     } catch (IOException e) {
         System.out.println("IO error occurred while reading the CSV file");
     } finally {
         try {
             if (br1 != null)
                 br1.close();
         } catch (IOException e) {
             System.out.println("Error closing the CSV file");
         }
         System.out.println("this is the complete execution");
     }
 }

}
