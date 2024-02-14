package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[][] = { {3, 5, 7}, {4, 1, 9}, {2, 6, 5} };
		
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
