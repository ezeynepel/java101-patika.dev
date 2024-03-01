import java.util.Scanner;

public class PalindromWord {
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		for (;i < j; i++,j--) {
			if (str.charAt(i) != str.charAt(j))
                return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen kelimeyi yazınız: ");
		String word = sc.next();
		if (isPalindrome(word)) {
			System.out.println("Palindrom bir kelime.");
		}else
			System.out.println("Palindrom bir kelime değil.");
	}
}
