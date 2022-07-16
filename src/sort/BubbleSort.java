package sort;

import java.util.Arrays;

public class BubbleSort {

	private int[] sort(int[] numbers) {

		int len = numbers.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		return numbers;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));

		BubbleSort obj = new BubbleSort();

		int[] result = obj.sort(numbers);
		System.out.println(Arrays.toString(result));

	}

}
