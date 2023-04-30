package employee;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

	}

	public void run() {
		System.out.println("Adı : " + this.name);
		System.out.println("Maaşı : " + this.salary);
		System.out.println("Çalışma Saati : " + this.workHours);
		System.out.println("Başlangıç Yılı : " + this.hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maaş Artışı : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
		System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
	}

	public double tax() {
		if (this.salary <= 1000) {
			return 0;
		} else {
			double tax = (salary * 3) / 100;
			return tax;
		}

	}

	public int bonus() {
		if (this.workHours > 40) {
			return ((workHours - 40) * 30);
		}
		return 0;
	}

	public double raiseSalary() {
		int a = 2021 - this.hireYear;
		if (a < 10) {
			return ((this.salary * 5) / 100);
		} else if (a > 9 && a < 20) {
			return ((this.salary * 10) / 100);
		} else if (a > 19) {
			return ((this.salary * 15) / 100);
		}
		return 0;
	}

}
