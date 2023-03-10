package arrayExercise;

import java.util.Arrays;

/****

<b>Title:</b> ArrayPractice.java<br>
<b>Project:</b> arrayExercise<br>
<b>Description:</b>This application displays 10 randomly generated integers stored inside an array.<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author George Clam
@version 1.0
@since Jan 06 2023
@updates: ****/

public class ArrayPractice {
	int[] numbers = new int[10];
	
	/**
	 * Runs the program by executing the runCode() method
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayPractice list = new ArrayPractice();
		list.runCode(list.numbers);
	}
	
	/**
	 * Assigns randomly generated numbers to the array declared at the top of the class
	 * @param arr
	 */
	public void generateNumbers(int[] arr) {
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
	}
	
	/**
	 * Prints values of the array to the console
	 * @param arr
	 */
	public void displayNumbers(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Executes the generateNumbers() method and the displayNumbers() method
	 * @param arr
	 */
	public void runCode(int[] arr) {
		generateNumbers(arr);
		displayNumbers(arr);
	}

}
