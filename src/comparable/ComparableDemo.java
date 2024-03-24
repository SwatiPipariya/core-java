package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
       
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		Student vayu = new Student(3, "Vayu", "California");
		Student vardaan = new Student(2, "Vardaan", "India");
		Student swati = new Student(1, "Swati", "US");
		
		list.add(vayu);
		list.add(vardaan);
		list.add(swati);
		
		Collections.sort(list);
		
		System.out.println("Students after sorting: ");
		list.forEach(student -> System.out.println(student.getName()));
		
	}
}
