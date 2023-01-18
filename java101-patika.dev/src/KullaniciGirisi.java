import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName, password, newPassword;
		int select;
		Scanner sc = new Scanner(System.in);

		System.out.println("Kullanıcı adınız: ");
		userName = sc.nextLine();
		System.out.println("Şifreniz: ");
		password = sc.nextLine();
		
		if(userName.equals("patika") && password.equals("java123.")) {
			System.out.println("Giriş yaptınız.");
		}else if(userName.equals("patika") && !password.equals("java123.")) {
			System.out.println("Şifrenizi yanlış!");
			System.out.println("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz?");
			System.out.println("1-Evet\n2-Hayır");
			select = sc.nextInt();
			if(select==1) {
				System.out.println("Yeni şifrenizi giriniz: ");
				newPassword = sc.next();
				
				if (newPassword.equals("java123.")) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				}else if (!newPassword.equals("java123.")) System.out.println("Şifre oluşturuldu");
				
			}else if (select==2) {
				System.out.println("İyi günler dileriz!");
			}else {
				System.out.println("Hatalı seçim yapıldı. Lütfen tekrar deneyin.");
			}
			
			
		}else if (!userName.equals("patika") && password.equals("java123.")) {
			System.out.println("kayıtlı kullanıcı bulunamadı");
		}
		
		
	}

}
