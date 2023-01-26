import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n, n1 = 0, n2 = 1, n3 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Eleman sayısını giriniz: ");
		n = sc.nextInt();

		System.out.print(n1 + " " + n2 + " ");
		for (int i = 1; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}

	}

}
