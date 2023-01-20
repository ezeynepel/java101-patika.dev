import java.util.Scanner;

public class BasamkSayisiToplami {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı Giriniz :");
		int number = input.nextInt();

		int basNumber = 0;
		int tempNumber = number;
		int basValue;
		int result = 0;

		while (tempNumber != 0) {
			basValue = tempNumber % 10;
			result = basValue + result;
			tempNumber = tempNumber / 10;

		}

		System.out.println("Basamak sayılarının toplamı: " + result);

	}

}
