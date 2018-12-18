import java.util.Scanner;
public class MulTable{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = inp.nextInt();
		int i;
		for(i=1;i<=10;++i){
		   System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
		
