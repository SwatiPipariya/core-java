package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrayList = new ArrayList<>(5);
		
		for(int i=1; i<=5; i++) {
			arrayList.add(i);
		}
		
		// Printing elements
		System.out.println(arrayList);
		
		// Remove element at index 3
		arrayList.remove(3);
		
		// Displaying the array list after deletion
		System.out.println(arrayList);
		
		// Printing the elements one by one
		
//		for(int i=0; i < arrayList.size(); i++) {
//			System.out.print(arrayList.get(i) + " ");
//		}
		
		// With the help of enhanced for loop
		
		for(int i: arrayList) {
			System.out.print(i + " ");
		}

	}

}
