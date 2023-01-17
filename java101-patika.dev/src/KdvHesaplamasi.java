import java.util.Scanner;

public class KdvHesaplamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tutar, kdvTutar, kdvliTutar, kdvOrani = 0.18;
		Scanner sc = new Scanner (System.in);
		System.out.println("ücret tutarını giriniz: ");
		tutar = sc.nextDouble();
		kdvTutar = tutar * kdvOrani;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz tutar: "+ tutar);
		System.out.println("KDV Oranı: "+ kdvOrani );
		System.out.println("KDv Tutarı: " + kdvTutar);
		System.out.println("KDV'li Tutar: "+kdvliTutar);

	}

}
