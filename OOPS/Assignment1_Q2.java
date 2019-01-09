import java.util.Scanner;
abstract class shape{
	String Shape;
	public abstract void area();
}
class rectangle extends shape{
	int length,breadth;
	//@Override
	public void area(){
	     System.out.println("Area of rectangle\n" + (length * breadth));
	}
}
class circle extends shape{
	int radius,area;
	//@Override
	public void area(){
	     area = (int) (3.14f * radius * radius);
	     System.out.println("Area of circle\n" + area);
	}
}
public class Assignment1_Q2{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	rectangle rect = new rectangle();
	circle cir = new circle();
	System.out.println("Enter l and h of rectangle");
	rect.length = input.nextInt();
	rect.breadth = input.nextInt();
	System.out.println("Enter radius of circle");
	cir.radius = input.nextInt();
	rect.area();
	cir.area();
	}
}

	
	
	

	
