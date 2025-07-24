package dayFour;
import java.util.Arrays;
public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"anu","sai","kavya","sreeja"};
		Arrays.sort(names);
		System.out.println("sorted names are:");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
