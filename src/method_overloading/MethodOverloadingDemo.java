package method_overloading;

public class MethodOverloadingDemo {
     
	public int multiply(int x, int y) {
		return x*y;
	}
	
	
	public int multiply(int x, int y, int z) {
		return x*y*z;
	}
	
	public double multiply(double x, double y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
        
		System.out.println(demo.multiply(10, 20));
		System.out.println(demo.multiply(5, 5, 5));
		System.out.println(demo.multiply(5.5, 10.5));
	}
	
    
}
