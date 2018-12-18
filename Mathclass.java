/*In order to perform certain mathematical operations like square root (sqrt), or power (pow); Java
has a built in class containing a number of methods as well as static constants, e.g.
Pi = 3.141592653589793 and E = 2.718281828459045.*/
import java.util.Scanner;
public class Mathclass {
	public static void main(String args[]){
		int a = 3,b = 4;
		double c;
		c = Math.sqrt(a*a + b*b);
		System.out.println("a = " + a + ",b = " + b);
		System.out.println("Square root of " + a + "and " + b + "= "+ c);
		c = Math.pow(3,5);
		System.out.println("3 ^ 5 = " + c);
		c = Math.max(3,5);
		System.out.println("max of 3 and  5 = " + c);
		c = Math.random();
		System.out.println("Math.random() generated " + c);	
	}
}
