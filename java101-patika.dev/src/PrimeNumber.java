import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int x, y, count;
		Scanner sc = new Scanner(System.in);

		System.out.print("Başlangıç sayısını giriniz: ");
		x = sc.nextInt();

		System.out.print("Bitiş sayını giriniz: ");
		y = sc.nextInt();

		for (int i = x; i < y; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.print(i+ " ");
			}

		}

	}

}
