import java.util.Scanner;

public class RecursiveFibonacci {
	static int fib(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Adım sayısını giriniz: ");
		number = sc.nextInt();
		System.out.println("Cevap: " + fib(number));
	}

}
