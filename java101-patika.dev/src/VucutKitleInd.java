import java.util.Scanner;

public class VucutKitleInd {

	public static void main(String[] args) {
		double m, kg, indeks;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		m =sc.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz :");
		kg =sc.nextDouble();
		
		indeks= kg/(m*m);
		System.out.println("Vücut Kitle İndeksiniz : "+indeks);
		

	}

}
