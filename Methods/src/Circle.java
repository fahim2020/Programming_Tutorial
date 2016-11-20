
import java.util.Scanner;

public class circle {
	// todo: add some methods to compute a circle's diameter, circumference and
	// area.
	// print some outputs to confirm you methods are working right.
	public static final double PI = 3.14;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter raduis: ");
		double raduis = scan.nextDouble();
		double area = PI * raduis * raduis;
		double dia= 2* raduis;
		double circum=2*PI*raduis;
		System.out.println("Circle area = " + area);
		System.out.println("Circle diameter = " + dia);
		System.out.println("Circle Circumference = " + circum);
			
	}
}
