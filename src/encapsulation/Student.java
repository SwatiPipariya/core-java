package encapsulation;

public class Student {
	
      private String name;
      private int age;
      private String addresses;
      
      public Student(String name, int age, String addresses) {
  		super();
  		this.name = name;
  		this.age = age;
  		this.addresses = addresses;
  	}
      
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

	public String getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
	
	 @Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", addresses=" + addresses + "]";
		}
		public static void main(String[] args) {
			
		}
	
}
