import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexedOut {
	public static void main(String args[]) {
		int[] Array = { 41, 52, 37, 49, 59, 60, 76, 88 };
		System.out.println("Elements in the array are: ");
		System.out.println(Arrays.toString(Array));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the required element:");
		try {
			int element = sc.nextInt();
			System.out.println("Element in the given index is:" + Array[element]);
		} catch (Exception e) {
			System.out.println("The index you have entered is invalid," + "Please enter the index between 0 and 7");

		}
	}
}