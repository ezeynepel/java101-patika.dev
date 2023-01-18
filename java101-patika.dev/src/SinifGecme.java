import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Matematik notunuz: ");
		mat = sc.nextInt();
		mat = (0 <= mat && mat <= 100) ? mat : 0;

		System.out.println("Fizik notunuz: ");
		fizik = sc.nextInt();
		fizik = (0 <= fizik && fizik <= 100) ? fizik : 0;

		System.out.println("Türkçe notunuz: ");
		turkce = sc.nextInt();
		turkce = (0 <= turkce && turkce <= 100) ? turkce : 0;

		System.out.println("Kimya notunuz: ");
		kimya = sc.nextInt();
		kimya = (0 <= kimya && kimya <= 100) ? kimya : 0;

		System.out.println("Müzik notunuz: ");
		muzik = sc.nextInt();
		muzik = (0 <= muzik && muzik <= 100) ? muzik : 0;

		sum = mat + fizik + turkce + kimya + muzik;
		double average = sum / 5;

		if (average <= 55)
			System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
		else
			System.out.println("Tebrikler sınıfı geçtiniz!");
		System.out.println("Ortalamanız : " + average);
	}
}
