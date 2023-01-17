import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mat, fiz, kim, tr, tarih, muzik;
		
		System.out.println("matematik notunu giriniz");
		mat = sc.nextInt();
		
		System.out.println("fizik notunu giriniz");
		fiz = sc.nextInt();
		
		System.out.println("kimya notunu giriniz");
		kim = sc.nextInt();
		
		System.out.println("türkçe notunu giriniz");
		tr = sc.nextInt();
		
		System.out.println("tarih notunu giriniz");
		tarih = sc.nextInt();
		
		System.out.println("müzik notunu giriniz");
		muzik = sc.nextInt();
		
		int sum = mat + fiz + kim + tr + tarih + muzik;
		double grade = sum/6.0;
		
		System.out.println("not ortalamanız: "+ grade);
		
		System.out.println((grade>60)? "geçti":"kaldı");
		
		
		


	}

}
