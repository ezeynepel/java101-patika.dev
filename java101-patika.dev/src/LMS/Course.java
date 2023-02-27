public class Course {
	String name;
	String code;
	String prefix;
	int note;
	Teacher courseTea;

	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
	}

	public void addTea(Teacher t) {
		if (this.prefix.equals(t.branch)) {
			this.courseTea = t;
		} else {
			System.out.println(t.name + " Akademisyeni bu dersi veremez.");
		}
	}

	public void printTea() {
		if (courseTea != null) {
			System.out.println(this.name + " dersinin akademisyeni: " + courseTea.name);
		} else
			System.out.println(this.name + " dersine akademisyen atanmamıştır.");
	}

}
