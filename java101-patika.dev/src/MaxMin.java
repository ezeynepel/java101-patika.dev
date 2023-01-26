import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int n, min=0, max=0, number;
		Scanner sc = new Scanner(System.in);

		System.out.print("Kaç tane sayı gireceksiniz: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". Sayıyı giriniz: ");
			number = sc.nextInt();
			if (i == 1) {
				min = number;
				max = number;
			} else {
				if (number < min) {
					min = number;
				} else if (max < number) {
					max = number;
				}
			}

		}

		System.out.println("En büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);

	}

}
