package sort;

import java.util.Arrays;

public class InsertionSort {

	private int[] sort(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {

			// Take current element as key
			int key = numbers[i];

			// Consider elements to left of key element
			int j = i - 1;

			// Move elements of numbers[0..i-1], that are greater than key, to one position ahead of their current position
			while (j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j--;
			}

			// Move key element to empty space
			numbers[j + 1] = key;
		}

		return numbers;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));

		InsertionSort obj = new InsertionSort();

		int[] result = obj.sort(numbers);
		System.out.println(Arrays.toString(result));

	}

}
