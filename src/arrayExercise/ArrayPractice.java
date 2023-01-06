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
	
	public static void main(String[] args) {
		ArrayPractice list = new ArrayPractice();
		
		list.runCode();
	}
	
	/**
	 * Assigns randomly generated numbers to the array declared at the top of the class
	 */
	public void generateNumbers() {
		for (int i = 0; i < 10; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
	}
	
	public void displayNumbers() {
		System.out.println(Arrays.toString(numbers));
	}
	
	public void runCode() {
		generateNumbers();
		displayNumbers();
	}

}
