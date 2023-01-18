import java.util.Scanner;

public class TekSayiyaKadarToplam {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Sayı giriniz: ");
			n = sc.nextInt();
			if (n % 2 == 0 && n % 4 == 0) {
				sum = sum + n;
			}

		} while ((n % 2 == 0));

		System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıları toplamı: " + sum);

	}

}
