import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map <String,Integer> map = new TreeMap<>();
		
		map.put("Chaitanya", 99);
		map.put("Rushikesh", 98);
		map.put("Amol", 97);
		map.put("Santosh", 96);
		map.put("Manoj", 95);
		
		System.out.println(map);
		
	}

}
