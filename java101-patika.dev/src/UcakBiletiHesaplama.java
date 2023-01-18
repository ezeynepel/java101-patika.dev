import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		int km, age, select;
		double perKm = 0.10, cost, sale = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Mesafeyi km türünden giriniz : ");
		km = sc.nextInt();

		System.out.println("Yaşınızı giriniz : ");
		age = sc.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		select = sc.nextInt();
		select = (select == 1 || select == 2) ? select : 0;

		cost = km * perKm;
		if (0 <= km) {
			if (select == 0) {
				System.out.println("Hatalı Veri Girdiniz !");
			} else if (select == 1) {
				if (age < 12)
					cost = cost - (cost * 0.50);
				else if (12 <= age && age < 24)
					cost = cost - (cost * 0.10);
				else if (65 < age)
					cost = cost - (cost * 0.30);
				System.out.println("Toplam tutar = " + cost + " TL");
			} else if (select == 2) {
				if (age < 12)
					cost = cost - (cost * 0.50);
				else if (12 <= age && age < 24)
					cost = cost - (cost * 0.10);
				else if (65 < age)
					cost = cost - (cost * 0.30);
				sale = cost * 0.20;
				cost = (cost - sale) * 2;
				System.out.println("Toplam tutar = " + cost + " TL");
			}
		} else
			System.out.println("Hatalı Veri Girdiniz !");

	}

}
