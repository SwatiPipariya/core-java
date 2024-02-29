package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// In map we can enter multiple null value
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		
		System.out.println("Size of map is: " + map.size());
		System.out.println(map);
		
		if (map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value for key" + " \"a\" is :- " + a );
		}
		
		for(String key : map.keySet()) {
			System.out.println("Key: " + key+", value: " + map.get(key));
		}
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key- " + entry.getKey() + ", value: " + entry.getValue());
		}
	}

}
