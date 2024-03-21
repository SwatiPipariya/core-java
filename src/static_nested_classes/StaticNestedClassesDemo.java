package static_nested_classes;

public class StaticNestedClassesDemo {
	
    public static void main(String[] args) {
		// Accessing a static nested class
    	OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
    	
    	nestedObject.display();
	}
}
