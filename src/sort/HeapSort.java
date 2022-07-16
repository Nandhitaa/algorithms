package sort;

import java.util.Arrays;

public class HeapSort {

	// max heapify a subtree rooted with node root which is an index in numbers[]. size is size of heap
	private void heapify(int[] numbers, int size, int root) {

		// Initialize largest as root
		int largest = root;
		int left = 2 * root + 1;
		int right = 2 * root + 2;

		// If left child is larger than root
		if (left < size && numbers[left] > numbers[largest]) {
			largest = left;
		}

		// If right child is larger than largest so far
		if (right < size && numbers[right] > numbers[largest]) {
			largest = right;
		}

		// If largest is not root
		if (largest != root) {
			int temp = numbers[root];
			numbers[root] = numbers[largest];
			numbers[largest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(numbers, size, largest);
		}
	}

	private int[] sort(int[] numbers) {
		int size = numbers.length;

		// Build max heap (rearrange array)
		for (int i = size / 2 - 1; i >= 0; i--) {
			heapify(numbers, size, i);
		}

		// One by one extract an element from heap
		for (int i = size - 1; i >= 0; i--) {

			// Move current root to end
			int temp = numbers[0];
			numbers[0] = numbers[i];
			numbers[i] = temp;

			// Call max heapify on the reduced heap
			heapify(numbers, i, 0);
		}

		return numbers;
	}

	public static void main(String[] args) {

		int[] numbers = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(numbers));

		HeapSort obj = new HeapSort();

		int[] result = obj.sort(numbers);
		System.out.println(Arrays.toString(result));

	}

}
