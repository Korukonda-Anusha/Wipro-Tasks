package dayEight;
import java.util.HashMap;
import java.util.Map;
public class Col_Map {

	public static void main(String[] args) {
		Map<String,Integer> mapdata=new HashMap<String,Integer>();
		mapdata.put("A", 20);
		mapdata.put("B", 87);
		mapdata.put("C", 78);
		mapdata.put("D", 78);
		mapdata.put("E", 98);
		System.out.println(mapdata.values());
		for(String key:mapdata.keySet()) {
			System.out.println(key+":"+mapdata.get(key));
		}
	}

}
