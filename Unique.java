// CIS218 Final Exam
// Let's try to knock this crap out
import java.util.InputMismatchException;
import java.util.Scanner;

public class Unique {
	// initialize the damn array
	int[] array = new int[5]; 
	// whatever this is
	public void getNumbers() {
		// initialize new Scanner object
		Scanner input = new Scanner(System.in);
		// initialize temporary variable
		int temp = 0;
		// loop for user input
		for (int i = 0; i < array.length; i++) {
			// prompt user
			System.out.print("Enter number: ");
			// check user input for error
			try {
				temp = input.nextInt();
			} catch (InputMismatchException exception) {
				i -= 1;
				System.out.println("Please enter an integer");
				if (i >= 0) {
					printNumbers(array);
				}
				input.nextLine(); // throw out input
				continue;
			} 
			// check if values are in range
			if (temp >= 10 && temp <= 100) {
				// check if array values are not unique
				if (i == 0) {
					array[i] = temp;
				} else {
					for (int j = 0; j < i; j++) {
						if (temp != array[j]) {
							array[i] = temp;
							// printNumbers(array);
						} else {
							System.out.println(temp + " has already been entered");
							i -= 1;
							break;
						}
					}
				}
			} else {
				System.out.println("Please enter an integer between 10 and 100");
				i -= 1;
			}
			// print the values of array after each attempt
			printNumbers(array);
		}
		input.close();
	}
	
	public static void printNumbers(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] != 0) {
				System.out.print(arr[k] + " ");
			}
		}
		System.out.println();
	}
}
