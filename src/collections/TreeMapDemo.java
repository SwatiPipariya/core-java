package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
       
//		TreeMap<Integer, String> treeMap = new TreeMap<>();
//		
//		treeMap.put(2, "A");
//		treeMap.put(1, "B");
//		treeMap.put(3, "C");
		
		// Now changing the basis of sequencing from integer to string
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("C", 2);
		treeMap.put("A", 3);
		treeMap.put("B", 1);
		
		
		
		
		System.out.println(treeMap);
	}

}
