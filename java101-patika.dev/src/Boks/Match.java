package Boks;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}

	public void run() {
		if (checkWeight()) {
			first(f1,f2);
			while (f1.health > 0 && f2.health > 0) {
				System.out.println("---------NEW ROUND-------");
				f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();

			}
		} else {
			System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
		}

	}

	public boolean checkWeight() {
		return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);

	}

	public boolean isWin() {
		if (f1.health == 0) {
			System.out.println("Maçı Kazanan : " + f2.name);
			return true;
		}

		if (f2.health == 0) {
			System.out.println("Maçı Kazanan : " + f1.name);
			return true;
		}
		return false;

	}
	 
	public void printScore() {
		System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
	}
	
	public void first(Fighter f1, Fighter f2) {
		double a = Math.random() * 100;
		if (a<=50){
            this.f1=f1;
            this.f2=f2;
            System.out.println("ilk boksör: "+ f1.name);
            System.out.println("ikinci boksör: "+ f2.name);
        }
        else {
            this.f2=f1;
            this.f1=f2;
            System.out.println("ilk boksör: "+ f2.name);
            System.out.println("ikinci boksör: "+ f1.name);
        }
	}
	
	

}
