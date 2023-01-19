import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int n, k, total = 1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Üssü alınacak sayıyı giriniz: ");
		n = sc.nextInt();
		
		System.out.println("Üs olacak sayıyı giriniz: ");
		k = sc.nextInt();
		
		for (int i = 1 ; i<=k ; i++) {
			total = total*n;
		}
		System.out.println("Cevap: " + total);

	}

}
