package daySix;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_xml {
	public static void main(String[] args) {
        File f1 = new File("data.xml");
        BufferedReader br1 = null;
        String line;

        try {
            br1 = new BufferedReader(new FileReader(f1));
            while ((line = br1.readLine()) != null) {
                System.out.println("XML Line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
        } catch (IOException e) {
            System.out.println("IO error occurred while reading the XML file");
        } finally {
            try {
                if (br1 != null)
                    br1.close();
            } catch (IOException e) {
                System.out.println("Error closing the XML file");
            }
            System.out.println("this is the complete execution");
        }
    }

}
