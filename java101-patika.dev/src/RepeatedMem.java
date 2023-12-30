import java.util.Arrays;
import java.util.Scanner;

public class RepeatedMem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, same = 0, ind = 0;

		System.out.print("Enter the array length: ");
		length = sc.nextInt();

		int[] arr = new int[length];
		int[] arra = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print("Enter " + (i + 1) + ". element= ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(arr));

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i != j && arr[i] == arr[j] && arr[i] % 2 == 0) {
					if (!isFind(arra, arr[i])) {
						arra[ind++] = arr[i];
					}
				}

			}

		}

		System.out.print("Repeating even numbers: ");
		for (int value : arra) {
			if (value != 0) {
				System.out.print(value + " ");
			}
		}

	}

	static boolean isFind(int[] arr, int val) {
		for (int i : arr) {
			if (i == val) {
				return true;
			}
		}
		return false;
	}

}
