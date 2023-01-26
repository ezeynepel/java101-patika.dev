import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Basamak sayısı: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= (2 * num) - (2*i); k++) {
				System.out.print("*");
			}

			System.out.println();
			
		}

	}

}
