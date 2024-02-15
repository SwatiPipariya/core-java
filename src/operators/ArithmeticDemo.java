package operators;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 2;
//		int b = 3;
//		int sum = a + b;
//		System.out.println(sum);
		
		
		// Addition Operation
		int result = 2 + 3;
		// result is now 5;
		System.out.println("2 + 3 = " + result);
		int original_result = result;
		
		// Subtraction Operation
		result = result - 1;
		// result is now 4
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		
		// Multiplication Operation
		result = result * 2;
		// result is now 8
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;
		
		// Division Operation
		result = result / 2;
		// result is 4 now
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		
		// Modulus Operation
		result = result % 3;
		// result is 1 now
		System.out.println(original_result + " % 3 = " + result);
		
		
		
		

	}

}
