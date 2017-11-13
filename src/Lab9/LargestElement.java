package Lab9;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What will the dimensions of your array be?");
		int row = s.nextInt();
		int col = s.nextInt();
		double[][] arr = new double[row][col];
		System.out.println("Enter the values for array b, row by row");
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = s.nextDouble();
			}
		}

	}
	
	public static int[] locateLargest(double[][] a) {
		int max = 0;
		for (int row = 0; row < a.length; row++) {
			int temp = 
			for (int col = 0; col < a[0].length; col++) {
				if (a[row][col] > temp)
					max = a[row][col];
			}
		}
	}

}
