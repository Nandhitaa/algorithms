package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	private int search(int[] numbers, int target) {

		int low = 0;
		int high = numbers.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (numbers[mid] == target) {
				return mid;
			}
			else if (target < numbers[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter Number of Elements in array:");
		int count = reader.nextInt();

		System.out.println("Enter the numbers:");
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = reader.nextInt();
		}

		Arrays.sort(numbers);

		System.out.println("Enter the number to find:");
		int element = reader.nextInt();

		BinarySearch obj = new BinarySearch();

		int result = obj.search(numbers, element);

		if (result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at position:" + result);
		}

		reader.close();
	}

}
