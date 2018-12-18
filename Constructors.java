//A class is a sort of template which has attributes and methods. An object is an instance of a class
class Vehicle{//class named ‘Vehicle’ having three attributes
	int passengers; //number of passengers
        int fuelcap; //fuel capacity
        int mpg; //fuel consumption
	
	//A constructor is created by default and initializes all member variables to zero. However we can create our constructors and set 
	//the values the way we want
	Vehicle(int x,int y,int z){
	   passengers = x;
	   fuelcap = y;
	   mpg = z;
	}

	//default constructor
	/*Vehicle(){
	   passengers = 0;
	   fuelcap = 0;
	   mpg = 0;
	}*/
}

public class Constructors{
	public static void main(String args[]){
                //This statement allocates a space in memory for the object and it also creates a reference
		Vehicle car = new Vehicle(5,10,15);
		

		Vehicle Auto;  // reference to object only
		Auto = new Vehicle(6,12,18); // an object is created
	        
		Vehicle bus = car;
		//We have created a new instance of type Vehicle named car. bus is NOT another instance of type Vehicle
		//bus is the same object as car and has been assigned the same properties
		System.out.println("---------car----------");
		System.out.println("passengers = " + car.passengers);
		System.out.println("fuel capacity = " + car.fuelcap);
		System.out.println("fuel consumption = " + car.mpg);
		System.out.println("---------Auto----------");
		System.out.println("passengers = " + Auto.passengers);
		System.out.println("fuel capacity = " + Auto.fuelcap);
		System.out.println("fuel consumption = " + Auto.mpg);
		System.out.println("---------bus----------");
		System.out.println("passengers = " + bus.passengers);
		System.out.println("fuel capacity = " + bus.fuelcap);
		System.out.println("fuel consumption = " + bus.mpg);
	}
}
