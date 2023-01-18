import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("İlk sayıyı giriniz: ");
		a = sc.nextInt();

		System.out.println("İkinci sayıyı giriniz: ");
		b = sc.nextInt();

		System.out.println("Üçüncü sayıyı giriniz: ");
		c = sc.nextInt();

		if (b < a && c < a) {
			if (c < b)
				System.out.println("c < b < a ");
			else if (b < c)
				System.out.println("b < c < a ");
		} else if (a < b && c < b) {
			if (c < a)
				System.out.println("c < a < b ");
			else if (a < c)
				System.out.println("a < c < b ");
		} else if (a < c && b < c) {
			if (b < a)
				System.out.println("b < a < c ");
			else if (a < b)
				System.out.println("a < b < c ");
		}

	}

}
