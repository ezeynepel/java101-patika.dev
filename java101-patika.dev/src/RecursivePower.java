import java.util.Scanner;

public class RecursivePower {

	static int result(int base, int pow) {
		if (pow != 0)
			return base * result(base, pow - 1);
		else
			return 1;
	}

	public static void main(String[] args) {
		int base, pow;

		Scanner sc = new Scanner(System.in);

		System.out.print("Taban sayısını giriniz : ");
		base = sc.nextInt();

		System.out.print("Üstü sayısını giriniz : ");
		pow = sc.nextInt();

		System.out.print(base + " üssü " + pow + " eşittir " + result(base, pow));

	}

}
