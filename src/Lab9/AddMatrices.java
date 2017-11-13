package Lab9;
import java.util.Arrays;
import java.util.Scanner;
public class AddMatrices {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What will the dimensions of your arrays be?");
		int row = s.nextInt();
		int col = s.nextInt();
		double[][] a = new double[row][col];
		double[][] b = new double[row][col];
		System.out.println("Enter the values for array a, row by row");
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				a[r][c] = s.nextDouble();
			}
		}
		System.out.println("Enter the values for array b, row by row");
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b[0].length; c++) {
				b[r][c] = s.nextDouble();
			}
		}
		System.out.print("The sum of the two arrays " + Arrays.deepToString(a) + " and " + Arrays.deepToString(b) + " equals " );		
		System.out.print(Arrays.deepToString(addMatrix(a, b)));
		
		//double[][] c = addMatrix(a, b);
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

}
