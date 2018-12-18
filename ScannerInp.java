import java.util.Scanner;
public class ScannerInp{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = inp.nextInt();
		System.out.println("Enter second number : ");
		int b = inp.nextInt();
		System.out.println("Enter third number : ");
		int c = inp.nextInt();
		System.out.println("Average = " + (a + b + c)/3);
	}
}
		
