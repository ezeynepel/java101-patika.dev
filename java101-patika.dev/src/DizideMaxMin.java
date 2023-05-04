import java.util.Arrays;
import java.util.Scanner;

public class DizideMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, max = n, min = n;

		int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };

		System.out.println("Dizi: " + Arrays.toString(arr));
		System.out.print("Girilen sayı: ");
		n = sc.nextInt();

		Arrays.sort(arr);
		System.out.println("Sıralanmış dizi: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				max = arr[i];
				break;
			}

		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < n) {
				min = arr[i];
				break;
			}

		}

		System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

	}

}
