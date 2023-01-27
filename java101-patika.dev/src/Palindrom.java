import java.util.Scanner;

public class Palindrom {

	static boolean isPalindrom(int n) {
		int temp = n, reservedNumber = 0, lastNumber;

		while (temp != 0) {
			lastNumber = temp % 10;
			reservedNumber = (reservedNumber * 10) + lastNumber;
			temp /= 10;

		}
		if (n == reservedNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Kontrol edilen sayıyı giriniz: ");
		number = sc.nextInt();
		System.out.println(isPalindrom(number));

	}

}
