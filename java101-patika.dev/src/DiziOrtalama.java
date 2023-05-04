import java.util.Scanner;

public class DiziOrtalama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum = 0.0, har = 0.0;

		System.out.println("Tavan sayıyı giriniz: ");
		n = sc.nextInt();

		double[] numbers = new double[n];

		for (double i = 0; i < n; i++) {
			numbers[(int) i] = 1 / (i + 1);
			sum += numbers[(int) i];

		}
		System.out.println("Dizideki sayıların ortalaması: " + sum / numbers.length);
		har = n / sum;
		System.out.println("Dizideki sayıların harmonik ortalaması: " + har);

	}

}
