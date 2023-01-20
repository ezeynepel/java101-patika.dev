import java.util.Scanner;

public class HarmonikSayi {

	public static void main(String[] args) {
		int n;
		double k, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("N sayısını giriniz: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			k = 1.0 / i;
			sum = sum + k;
		}

		System.out.println("Harmonik Seri Toplamı: " + sum);

	}

}
