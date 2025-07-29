package dayEight;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Col_TreeSet {

	public static void main(String[] args) {
		Set <Integer>setdata=new TreeSet();
		setdata.add(77);
		setdata.add(38);
		setdata.add(68);
		setdata.add(19);
		setdata.add(54);
		setdata.add(32);
		//setdata.add("Hello");
		System.out.println(setdata);
		Iterator i=setdata.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//print one by one

	}

	}}
