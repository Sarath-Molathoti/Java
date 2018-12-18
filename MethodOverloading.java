//The term overloading refers to the act of using the same method/constructor name in a class but
//different parameter declarations. Method overloading is an example of Polymorphism
class Overload{
	void sample(int x){
	     System.out.println("One Parameter : " + x);
	}
	void sample(int x,int y){
	     System.out.println("Two Parameters : " + x + " " + y );
	}
	void sample(int x,int y,int z){
	     System.out.println("Three Parameters : " + x + " " + y + " " + z);
	}
}

public class MethodOverloading{
	public static void main(String args[]){
        	Overload ex = new Overload();
		ex.sample(1);
		ex.sample(1,2);
		ex.sample(1,2,3);
	}
}
