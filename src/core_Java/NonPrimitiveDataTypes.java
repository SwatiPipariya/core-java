package core_Java;


public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		// 1. Strings
		
		//First Way
		String str = "Vayu";  // In this case string is going to use the same object multiple no. of times ; its reusable
		                         
		System.out.println("String is: " +  str);
		
		//Second Way
		String str2 = new String("Vardaan"); // But in this case when we call this everytime we call this its going to create new object
		System.out.println("Another string is: " +  str2);
		
		
		// 2. Arrays
		
		int arr[];
		arr = new int[3];
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		
		System.out.println(arr[0]);
	}

}
