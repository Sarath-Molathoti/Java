import java.util.Scanner;
class Arithmetic_operations{
	void add(int a){
	     System.out.println("-1* Number is " + (-1 * a));
	}
	void add(int a,int b){
	     System.out.println("Sum is " + (a + b));
	}
	void add(int a,int b,int c){
	     System.out.println("Sum is " + (a + b + c));
	}
}
public class Assignment1_Q4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Arithmetic_operations fun = new Arithmetic_operations();
		int n,a,b,c;
		n = 0;
		while(n != 4){
		System.out.println("1- Add two numbers\n2- Add three numbers\n3- -1 * number\n4 exit");
		System.out.print("Enter option : ");
		n = input.nextInt();
		switch(n){
		case 1:
		       System.out.println("Enter 2 numbers");
		       a = input.nextInt();
		       b = input.nextInt();
		       fun.add(a,b);
		       System.out.print("\n");
		       break;
		case 2:
		       System.out.println("Enter three numbers");
		       a = input.nextInt();
		       b = input.nextInt();
		       c = input.nextInt();
		       fun.add(a,b,c);
		       System.out.print("\n");
		       break;
		case 3:
		       System.out.print("Enter number ");
		       a = input.nextInt();
		       fun.add(a);
		       System.out.print("\n");
		       break;
		case 4:
		       break;
		}
		//System.out.print("\n");
		}		
	}
}
