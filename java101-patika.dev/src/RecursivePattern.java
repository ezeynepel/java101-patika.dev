import java.util.Scanner;

public class RecursivePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, num;
		
		System.out.print("N sayısı: ");
		num = sc.nextInt();
		a = num;
		
		System.out.print("Çıktısı: " + a);
		while (a>0) {
			a=a-5;
			System.out.print(" " + a);
		}
		
		while(a<num){
			a=a+5;
			System.out.print(" " + a);
		}

	}

}
