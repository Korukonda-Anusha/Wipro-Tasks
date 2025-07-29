package dayEight;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Col_Set {

	public static void main(String[] args) {
			Set <Integer>setdata=new HashSet();
			setdata.add(61);
			setdata.add(25);
			setdata.add(67);
			//setdata.add("Hiii");
			System.out.println(setdata);
			Iterator i=setdata.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}

	}

}
