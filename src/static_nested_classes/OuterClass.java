package static_nested_classes;

public class OuterClass {
        static int outerStaticMember = 10;
        
        int instanceMember = 20;
        
        private static int outerPrivateMember = 30;
        
        static class StaticNestedClass {
        	void display() {
        		System.out.println("Static member of outer class: " + outerStaticMember);
        		System.out.println("Private static member of outer class: " + outerPrivateMember);
//        		System.out.println("Non static member of outer class: " + instanceMember);
        	}
        }
}
