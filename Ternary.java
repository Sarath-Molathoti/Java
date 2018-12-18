import java.util.Scanner;
public class Ternary{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int a,b,c,max;
		System.out.println("This is to find the largest using ternary operator");
		System.out.print("Enter first number : ");
		a = inp.nextInt();
		System.out.print("Enter second number : ");
		b = inp.nextInt();
		System.out.print("Enter third number : ");
		c = inp.nextInt();
		max = a > b ? (a > c ? a : (b > c ? b : c)) : (b > c ? b : c);
		System.out.println("Largest among three numbers " + max);
	}
}
		
		
