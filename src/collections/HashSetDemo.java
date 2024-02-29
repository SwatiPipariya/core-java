package collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		
		hashSet.add("C");
//		boolean r1 =  hashSet.add("C");
//		System.out.println(r1);
		
		hashSet.add("C");
//		boolean r2 = hashSet.add("C");
//		System.out.println(r2);
		
		System.out.println(hashSet);
		
		System.out.println("Set contains D or not ? " + hashSet.contains("D"));
		
		hashSet.remove("A");
		System.out.println("Set after removing A is :" + hashSet);
		
		for(String item : hashSet) {
			System.out.print(item + " ");
		}
	}

}
