import java.util.Scanner;

public class RecursivePrime {

	static boolean isPrime(int n, int c) {
		if (n < 2) {
			System.out.println(n + " bir asal sayı değildir.");
			return false;
		}
		if (n == c) {
			System.out.println(n + " bir asal sayı.");
			return true;

		}
		if (n % c == 0) {
			System.out.println(n + " bir asal sayı değildir.");
			return false;
		}
		return isPrime(n, c + 1);
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Sayıyı giriniz: ");
		number = sc.nextInt();

		isPrime(number,2);

	}

}
