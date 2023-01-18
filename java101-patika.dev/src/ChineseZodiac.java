import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		int year, rem;
		String zodiac = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Doğum Yılınızı Giriniz : ");
		year = sc.nextInt();

		rem = year % 12;
		if (rem == 0)
			zodiac = "Maymun";
		else if (rem == 1)
			zodiac = "Horoz";
		else if (rem == 2)
			zodiac = "Köpek";
		else if (rem == 3)
			zodiac = "Domuz";
		else if (rem == 4)
			zodiac = "Fare";
		else if (rem == 5)
			zodiac = "Öküz";
		else if (rem == 6)
			zodiac = "Kaplan";
		else if (rem == 7)
			zodiac = "Tavşan";
		else if (rem == 8)
			zodiac = "Ejderha";
		else if (rem == 9)
			zodiac = "Yılan";
		else if (rem == 10)
			zodiac = "At";
		else if (rem == 11)
			zodiac = "Koyun";
		System.out.println("Çin Zodyağı Burcunuz: " + zodiac);

	}

}
