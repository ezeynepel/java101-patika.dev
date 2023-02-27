import java.util.Scanner;

public class MainLMS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, p, c, mv, pv, cv;
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course phy = new Course("Fizik", "FZK101", "FZK");
        Course che = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTea(t1);
        phy.addTea(t2);
        che.addTea(t3);

        Student s1 = new Student("Duru", 4, "1", mat, phy, che);
        System.out.print("Matematik notunu giriniz: ");
        m = sc.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        p = sc.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        c = sc.nextInt();
        System.out.print("Matematik sözlü notunu giriniz: ");
        mv = sc.nextInt();
        System.out.print("Fizik sözlü notunu giriniz: ");
        pv = sc.nextInt();
        System.out.print("Kimya sözlü notunu giriniz: ");
        cv = sc.nextInt();
        
        s1.addBulkExamNote(m,p,c,mv,pv,cv);
        s1.isPass();

	}

}
