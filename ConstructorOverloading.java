//The term overloading refers to the act of using the same method/constructor name in a class but
//different parameter declarations. Method overloading is an example of Polymorphism
class Overload{
	int height,weight,age;
	Overload(int x){
	     height = x;
	     System.out.println("One Parameter : " + height);
	}
	Overload(int x,int y){
	     height = x;
	     weight = y;
	     System.out.println("Two Parameters : " + height + " " + weight);
	}
	Overload(int x,int y,int z){
	     height = x;
	     weight = y;
	     age = z;
	     System.out.println("Three Parameters : " + height + " " + weight + " " + age);
	}
}

public class ConstructorOverloading{
	public static void main(String args[]){
        	Overload s1 = new Overload(1);
		Overload s2 = new Overload(1,2);
		Overload s3 = new Overload(1,2,3);
		
	}
}
