import java.util.Scanner;

public class TriangleAreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double perimeter, area;
		System.out.println("Enter the first edge: ");
		a = sc.nextInt();
		
		System.out.println("Enter the second edge: ");
		b = sc.nextInt();
		
		c = (int) Math.sqrt((a*a)+(b*b));
		perimeter= a+b+c;
		area = (a*b)/2;
		
		System.out.println("Hypotenuse: "+ c);
		System.out.println("Area: "+ area);
		System.out.println("Perimeter: "+ perimeter);
		

	}

}