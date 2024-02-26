package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[][] = { { 3, 6, 1 }, { 8, 9, 2 }, { 4, 7, 1 } };
		
		for (int i=0 ; i< 3; i++) {
			for (int j=0; j < 3; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} 
	}

}
