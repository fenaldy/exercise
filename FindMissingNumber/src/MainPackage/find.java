package MainPackage;

import java.util.Arrays;

public class find {
	
	public static void printMissingElements(int[] numbs) {
		int[] numbers = numbs;
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = 1; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[numbersArrayIndex]) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.print(i);
		    }
		}
	}
	
	public static void main(String []args) {
		int[] numbList = {1,4,7};
		printMissingElements(numbList);
	}

}
