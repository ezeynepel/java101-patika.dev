import java.util.Arrays;
import java.util.Scanner;

public class ElementSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Dizinin boyutunu giriniz: ");
		n= sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n;i++) {
			System.out.print((i+1) + ". elemanı giriniz: ");
			arr[i]= sc.nextInt();

		}
		Arrays.sort(arr);
		
		System.out.print("Sıralama: ");
		for (int i= 0; i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
