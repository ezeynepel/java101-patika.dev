import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		int km;
		double perKm = 2.20, total, startPrice = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("Mesafeyi KM cinsinden yazınız: ");
		km = sc.nextInt();

		total = startPrice + (km * perKm);
		total = (total < 20) ? 20 : total;

		System.out.println("Tutar: " + total + " tl.");

	}

}
