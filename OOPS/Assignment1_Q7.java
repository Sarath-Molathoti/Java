import java.util.Scanner;
class engine{
	int engine_no;
	int cc;
}
class car{
	String color;
	int price;
	engine engin = new engine();
}
public class Assignment1_Q7{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter car details : ");
		car car1 = new car();
	        car1.engin.engine_no = input.nextInt();
		car1.engin.cc = input.nextInt();
		car1.color = input.next();
		car1.price = input.nextInt();
	        System.out.print(car1.engin.engine_no + " ");
		System.out.print(car1.engin.cc + " ");
		System.out.print(car1.color + " ");
		System.out.println(car1.price + " ");
	}
}
		
