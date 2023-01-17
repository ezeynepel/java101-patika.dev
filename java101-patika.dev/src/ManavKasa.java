import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		double arm = 2.14, elma = 3.67, dom = 1.11, muz = 0.95, pat = 5.0, sum;
		int ak, ek, dk, mk, pk;

		Scanner sc = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo ? :");
		ak = sc.nextInt();
		System.out.println("Elma Kaç Kilo ? :");
		ek = sc.nextInt();
		System.out.println("Domates Kaç Kilo ? :");
		dk = sc.nextInt();
		System.out.println("Muz Kaç Kilo ? :");
		mk = sc.nextInt();
		System.out.println("Patlıcan Kaç Kilo ? :");
		pk = sc.nextInt();

		sum = (arm * ak) + (ek * elma) + (dom * dk) + (muz * mk) + (pat * pk);
		System.out.println("Toplam Tutar : " + sum + " TL");

	}

}
