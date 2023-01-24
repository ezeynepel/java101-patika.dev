import java.util.Scanner;

public class YildizUcgen {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir Sayı Giriniz: ");
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}

			System.out.println();

		}
		for (int i = 0; i < n; i++) {
			for (int j = n+1; (n - i) < j; j--) {
				System.out.print(" ");

			}for (int k = 1; k <= (2 * (n-i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
		}
			
			

	}

}
