package Lab9;
import java.util.Arrays;
import java.util.Scanner;
public class sumArrayColumns {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double[][] arr = new double[3][4];
		
		for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					arr[row][col] = s.nextDouble();
				}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Sum of the elements in column 0 is " + sumColumn(arr, 0));
		System.out.println("Sum of the elements in column 1 is " + sumColumn(arr, 1));
		System.out.println("Sum of the elements in column 2 is " + sumColumn(arr, 2));
		System.out.println("Sum of the elements in column 3 is " + sumColumn(arr, 3));
		

	}
	
	public static double sumColumn(double[][] arr, int columnIndex) {
		double returnVal = 0;
		for (int col = 0; col <= columnIndex; col++) {
		double sumCol = 0;
			for (int row = 0; row < arr.length; row++) {
				sumCol += arr[row][col];
			}
			returnVal = sumCol;
		} return returnVal;
	}

}
