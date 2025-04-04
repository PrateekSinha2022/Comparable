package uem_4;
import java.util.Scanner;
public class CircleDriver {
	public static void main(String[] args) {
		double radius= 0;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		Circle ob = new Circle();
		System.out.println(ob.area(radius));
	}

}
