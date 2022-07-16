package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	private int search(int[] numbers, int target) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements in array:");
		int count = Integer.parseInt(reader.readLine());

		System.out.println("Enter the numbers:");
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("Enter the number to find:");
		int element = Integer.parseInt(reader.readLine());

		LinearSearch obj = new LinearSearch();

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
