package sort;

import java.util.Arrays;

public class MergeSort {

	private void merge(int[] numbers, int left, int mid, int right) {

		// Find sizes of two sub-arrays to be merged
		int leftLen = mid - left + 1;
		int rightLen = right - mid;

		// Create temporary arrays for the two sorted arrays
		int leftNumbers[] = new int[leftLen];
		int rightNumbers[] = new int[rightLen];

		// Copy data to the temporary arrays
		for (int i = 0; i < leftLen; i++) {
			leftNumbers[i] = numbers[left + i];
		}
		for (int i = 0; i < rightLen; i++) {
			rightNumbers[i] = numbers[mid + 1 + i];
		}

		// Initial indexes of first and second sub-arrays
		int leftIndex = 0;
		int rightIndex = 0;

		// Initial index of merged array
		int resultIndex = left;

		// Till end of one temporary array compare and copy elements to main array
		while (leftIndex < leftLen && rightIndex < rightLen) {
			if (leftNumbers[leftIndex] < rightNumbers[rightIndex]) {
				numbers[resultIndex] = leftNumbers[leftIndex];
				leftIndex++;
			} else {
				numbers[resultIndex] = rightNumbers[rightIndex];
				rightIndex++;
			}
			resultIndex++;
		}

		// Copy remaining elements of leftNumbers if any
		while (leftIndex < leftLen) {
			numbers[resultIndex] = leftNumbers[leftIndex];
			leftIndex++;
			resultIndex++;
		}

		// Copy remaining elements of rightNumbers if any
		while (rightIndex < rightLen) {
			numbers[resultIndex] = rightNumbers[rightIndex];
			rightIndex++;
			resultIndex++;
		}
	}

	private int[] sort(int[] numbers, int left, int right) {

		if (left < right) {

			// Find the middle point
			int mid = left + (right - left) / 2;

			// Sort the first and second halves
			sort(numbers, left, mid);
			sort(numbers, mid + 1, right);

			// Merge the sorted halves
			merge(numbers, left, mid, right);
		}

		return numbers;
	}

	private int[] sort(int[] numbers) {
		return sort(numbers, 0, numbers.length - 1);
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));

		MergeSort obj = new MergeSort();

		int[] result = obj.sort(numbers);
		System.out.println(Arrays.toString(result));
	}

}
