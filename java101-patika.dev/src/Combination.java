import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		int n, r, x, formul, total = 1, total1 = 1, total2 = 1;
		Scanner sc = new Scanner(System.in);

		/*
		 * Faktöriyel hesaplama System.out.println("Faktöriyel Sayısı: "); n =
		 * sc.nextInt();
		 * 
		 * for (int i = 1; i <= n; i++) { total = total * i; } System.out.println(n +
		 * ". faktöriyel " + total);
		 */

		System.out.println("C(n,r) olmak üzere n sayısını giriniz: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			total = total * i;
		}

		System.out.println("C(n,r) olmak üzere r sayısını giriniz: ");
		r = sc.nextInt();

		for (int i = 1; i <= r; i++) {
			total1 = total1 * i;
		}

		x = n - r;

		for (int i = 1; i <= x; i++) {
			total2 = total2 * i;
		}

		formul = (total) / ((total1) * total2);

		System.out.println("Kombinasyon İşleminin Sonucu: " + formul);

	}

}
