package dayEight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Col_ArrayList {
public static void main(String[] args) {
List<Integer>c=new ArrayList<Integer>();
		c.add(10);
		c.add(11);
		c.add(34);
		System.out.println(c.get(1));
		System.out.println(c.indexOf(11));
		for(Object i:c) {
			int c1=(Integer)i;
			System.out.println(c1);
		}


		 }
		

	}


