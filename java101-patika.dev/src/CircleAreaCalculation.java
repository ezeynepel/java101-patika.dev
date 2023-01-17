import java.util.Scanner;

public class CircleAreaCalculation {

	public static void main(String[] args) {
		double pi=3.14, area, perimeter,a;
		int r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dairenin yarı çapını giriniz: ");
		r =sc.nextInt();
		
		System.out.println("Merkez açısının ölçüsünü giriniz: ");
		a =sc.nextDouble();
		
		
		area = (pi*r*r*a)/360;
		perimeter = (2*r) + ((2* pi*r*a)/360);
		
		System.out.println("Dairenin alanı: "+ area);
		System.out.printf("Dairenin çevresi: %.2f", perimeter);
		
		
		
		
	}

}
