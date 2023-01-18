import java.util.Scanner;

public class FourAndFivePower {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Sınır sayısını giriniz: ");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i*=4) {
			System.out.print(i+", ");
		}
		System.out.println();
		for(int i=1; i<=n; i*=5) {
			System.out.print(i+", ");
		}
		
		
	}

}
