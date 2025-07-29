package dayEight;
import java.util.HashMap;
import java.util.Map;
public class Col_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Anusha", 98);
        marks.put("Sai", 96);
        marks.put("Prassu", 92);

        // Print all entries
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Access specific student's marks
        System.out.println("Anusha marks: " + marks.get("Anusha"));
	}

}
