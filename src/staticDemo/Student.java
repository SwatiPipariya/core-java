package staticDemo;

public class Student {
     
	String name;
	int age;
	String address;
	static String college = "XYZ";
	static int count = 0;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	// A static method cannot access a non static variable  
//	static void studentCount() {
//		count = count + 1;
//	}
	
	// But a non static method can access both static and non static variable
//	int getCount() {
//		return count;
//	}
//	
	// Static block -- Is will be loaded only once when the program is initialised at the run time
		static {
			System.out.println("Initializer code");
			String college = "XYZ";
			int count = 0;
		}
}
