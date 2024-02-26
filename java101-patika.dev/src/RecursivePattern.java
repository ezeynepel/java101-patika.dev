import java.util.Scanner;

public class RecursivePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n;

		System.out.print("N sayısı: ");
		num = sc.nextInt();
		n = num;
		recursiveMethod(num, n);

	}

	public static void recursiveMethod(int num, int n) {
		System.out.print(n + " ");
		if (n > 0) {
			n = n - 5;
			recursiveMethod(num, n);
		} else {
			add(num, n+5);
		}

	}

	public static void add(int num, int n) {
		System.out.print(n + " ");
		if (n < num) {
			n = n + 5;
			add(num, n);
		}
	}
}
