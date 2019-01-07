//A class is a sort of template which has attributes and methods. An object is an instance of a class
class Vehicle{//class named ‘Vehicle’ having three attributes
	int passengers; //number of passengers
        int fuelcap; //fuel capacity
        int mpg; //fuel consumption
	
	//Methods are the functions which a particular class possesses. These functions usually use the data defined by the class itself
	void range(){
	     System.out.println("range = " + (fuelcap * mpg));
	}

	int Range(){
	     return (fuelcap * mpg);//Returning from a Method
	     //a method can be stopped from executing completely by using the return statement
	}
	//Method which accept Parameters
	boolean IsCapable(int x){
		if(x > 25) 
		  return true;
		else 
		  return false;
	}
}

public class Methods{
	public static void main(String args[]){
                //This statement allocates a space in memory for the object and it also creates a reference
		Vehicle car = new Vehicle();
		car.passengers = 5;
		car.fuelcap = 10;
		car.mpg = 15;

		Vehicle Auto;  // reference to object only
		Auto = new Vehicle(); // an object is created
	        Auto.passengers = 6;
		Auto.fuelcap = 12;
		Auto.mpg = 18;

		Vehicle bus = car;
		//We have created a new instance of type Vehicle named car. bus is NOT another instance of type Vehicle
		//bus is the same object as car and has been assigned the same properties
		System.out.println("---------car----------");
		System.out.println("passengers = " + car.passengers);
		System.out.println("fuel capacity = " + car.fuelcap);
		System.out.println("fuel consumption = " + car.mpg);
		car.range();
		System.out.println("---------Auto----------");
		System.out.println("passengers = " + Auto.passengers);
		System.out.println("fuel capacity = " + Auto.fuelcap);
		System.out.println("fuel consumption = " + Auto.mpg);
		int res1 = Auto.Range();
		System.out.println("range = " + res1);
		System.out.println("---------bus----------");
		System.out.println("passengers = " + bus.passengers);
		System.out.println("fuel capacity = " + bus.fuelcap);
		System.out.println("fuel consumption = " + bus.mpg);
		boolean bool = bus.IsCapable(30);
		System.out.println("capability =  " + bool);
		
	}
}
