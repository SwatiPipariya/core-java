package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
        // It does not allow duplicate value and prints output in ascending order
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("C");
		treeSet.add("B");
		treeSet.add("A");
		
		System.out.println(treeSet);
		
	}

}																	
										