package control_statements;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 50;
		
		if (i == 50) {
			System.out.println("i is 50");
			if (i < 75) {
				System.out.println("i is smaller than 75");
				if (i < 55) {
					System.out.println("i is also smaller than 55");
				}
			}
		}

	}

}
