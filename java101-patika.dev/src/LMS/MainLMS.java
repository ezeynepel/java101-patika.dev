
public class MainLMS {

	public static void main(String[] args) {
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
        s1.addBulkExamNote(80,70,80,100,80,59);
        s1.isPass();

	}

}
