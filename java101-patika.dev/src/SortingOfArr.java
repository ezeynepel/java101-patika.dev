import java.util.Arrays;
import java.util.Scanner;

public class SortingOfArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Dizinin boyutunu giriniz: ");
		x = sc.nextInt();
		int[] arr = new int[x];

		System.out.println("Dizinin elemanlarını giriniz :");

		for (int i = 0; i < x; i++) {
			System.out.print((i+1) + ". Elemanı: ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sıralama: " + Arrays.toString(arr));
		
	}

}
