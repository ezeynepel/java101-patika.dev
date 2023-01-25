import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int n1, n2, x, ebob = 0, ekok;
		Scanner sc = new Scanner(System.in);

		System.out.print("n1 sayısını giriniz: ");
		n1 = sc.nextInt();

		System.out.print("n2 sayısını giriniz: ");
		n2 = sc.nextInt();

		if (n1 < n2) {
			x = n1;
		} else {
			x = n2;
		}
		int i = 1;
		while (i <= x) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;

		}

		int j = 1;
		while (j <= (n1 * n2)) {
			if (j % n1 == 0 && j % n2 == 0) {
				System.out.println("Sayıların en küçük ortak katı: " + j);
				break;
			}
			j++;
		}

		System.out.println("Sayıların en büyük ortak böleni: " + ebob);

	}

}
