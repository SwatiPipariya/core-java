package staticDemo;

public class StaticDemo {
    public static void main(String[] args) {
		Student vayu = new Student("Vardaan", 12, "Bhopal");
		
		System.out.println(vayu.getName());
		System.out.println(vayu.getAge());
		System.out.println(vayu.getAddress());
		// Here we are accessing the static variable college with the help of class name not by object name because static
		// variable belong to class not to object
//		System.out.println(Student.college);
		
		
	}
}
