import java.util.Scanner;

public class BolunenSayilarinTop {

	public static void main(String[] args) {
		int k;
		double average, sum = 0, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Sayı Griniz: ");
		k = sc.nextInt();

		/*for döngüsüyle:
		 * for (int i = 0; i <= k; i++) { if (i % 3 == 0) && (i % 4 == 0)){ sum = sum +
		 * i; System.out.print(i + ", "); count++; } }
		 */
		int i = 0;
		while (i <= k) {
			if ((i % 3 == 0) && (i % 4 == 0)) {
				sum = sum + i;
				System.out.print(i + ", ");
				count++;
			}
			i++;

		}
		System.out.println();
		average = sum / count;
		System.out.println(average);

	}
}