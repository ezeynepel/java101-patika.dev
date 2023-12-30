import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfMem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, ind = 0;

		System.out.print("Enter the array length: ");
		length = sc.nextInt();

		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print("Enter " + (i + 1) + ". element= ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(arr));

		for (int i = 0; i < length; i++) {
			int count = 1; 
			for (int j = 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			boolean isDuplicate = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
			}

		}

	}
}
