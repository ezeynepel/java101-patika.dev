public class Student {
	String name;
	String stuNo;
	int classes;
	Course mat;
	Course matS;
	Course phy;
	Course phyS;
	Course che;
	Course cheS;
	double average;
	boolean isPass;

	public Student(String name, int classes, String stuNo, Course mat, Course phy, Course che) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.phy = phy;
		this.che = che;
		calcAverage();
		this.isPass = false;

	}

	public void addBulkExamNote(int mat, int phy, int che, int matS, int phyS, int cheS) {

		if (mat >= 0 && mat <= 100 && matS >= 0 && matS <= 100) {
			this.mat.note = (int) (mat * 0.8 + matS * 0.2);
		}

		if (phy >= 0 && phy <= 100 && phyS >= 0 && phyS <= 100) {
			this.phy.note = (int) (phy * 0.8 + phyS * 0.2);
		}

		if (che >= 0 && che <= 100 && cheS >= 0 && cheS <= 100) {
			this.che.note = (int) (che * 0.8 + cheS * 0.2);
		}

	}
	 public void isPass() {
	        if (this.mat.note == 0 || this.phy.note == 0 || this.che.note == 0) {
	            System.out.println("Notlar tam olarak girilmemiş");
	        } else {
	            this.isPass = isCheckPass();
	            printNote();
	            System.out.println("Ortalama : " + this.average);
	            if (this.isPass) {
	                System.out.println("Sınıfı Geçti. ");
	            } else {
	                System.out.println("Sınıfta Kaldı.");
	            }
	        }
	    }


	public void calcAverage() {
		this.average = (this.phy.note + this.che.note + this.mat.note) / 3;
	}

	public boolean isCheckPass() {
		calcAverage();
		return this.average > 55;
	}

	public void printNote() {
		System.out.println("=========================");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik Notu : " + this.mat.note);
		System.out.println("Fizik Notu : " + this.phy.note);
		System.out.println("Kimya Notu : " + this.che.note);
	}

}
