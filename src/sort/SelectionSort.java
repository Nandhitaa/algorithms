package sort;

import java.util.Arrays;

public class SelectionSort {

	private int[] sort(int[] numbers) {

		// One by one move boundary of unsorted sub-array
		for (int i = 0; i < numbers.length; i++) {

			// Find the minimum element in unsorted array
			int minIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}

			// Swap the found minimum element with first element of unsorted array
			int temp = numbers[i];
			numbers[i] = numbers[minIndex];
			numbers[minIndex] = temp;
		}
		return numbers;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));

		SelectionSort obj = new SelectionSort();

		int[] result = obj.sort(numbers);
		System.out.println(Arrays.toString(result));

	}

}
