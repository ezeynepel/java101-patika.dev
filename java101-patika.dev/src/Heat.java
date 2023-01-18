import java.util.Scanner;

public class Heat {

	public static void main(String[] args) {
		int heat;
		Scanner sc = new Scanner(System.in);

		System.out.println("Sıcaklık Giriniz: ");
		heat = sc.nextInt();

		if (heat < 5)
			System.out.println("Kayak yapabilirsiniz.");
		else if (5 <= heat && heat < 15)
			System.out.println("Sinemaya gidebilirsiniz.");
		else if (15 <= heat && heat < 25)
			System.out.println("Piknik yapabilirsiniz.");
		else if (25 <= heat)
			System.out.println("Yüzmeye gidebilirsiniz.");

	}

}
