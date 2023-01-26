import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Bir sayı giriniz: ");
		num = sc.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num)
			System.out.println(num + " Mükemmel sayıdır.");
		else
			System.out.println(num + " Mükemmel sayı değildir.");

	}

}
