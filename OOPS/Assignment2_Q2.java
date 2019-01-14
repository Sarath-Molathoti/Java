import java.util.Scanner;
enum type{O,E,L}
class Bus{
	int Busno,Fare,Distance;
	String From,To;
	//char type;
	type Type;
	Bus(int busno,String from,String to,int distance,type L){
	   Busno = busno;
	   From = from;
	   To = to;
	   Distance = distance;
	   Type = L;	   
	}
	Bus(int busno,String from,String to,int distance){
	   Busno = busno;
	   From = from;
	   To = to;
	   Distance = distance;
	   Type = type.O;	   
	}
	void CalcFare(){
	     if(Type == type.O)
                Fare = 10 * Distance;
	     else if(Type == type.L)
                Fare = 24 * Distance;
	     else 
                Fare = 20 * Distance;
	}
	void Show(){
	      System.out.print(Busno + " " + From + " " + To + " " + Distance + " " + Type);
	      CalcFare();
	      System.out.println(" " + Fare);
	}
	     
}
public class Assignment2_Q2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = 0,i = 0,j,busno,fare,distance;
		String from,to;
		Bus[] a = new Bus[100];
		while(n != 3){
		     System.out.println("1-Add details\n2-Show details\n3-Exit");
		     System.out.print("Enter choice ");
		     n = input.nextInt();
		     switch(n){
			case 1:
			      System.out.println("Enter bus details(Busno,from,to,distance,type)");
			      busno = input.nextInt();
			      from = input.next();
		  	      to = input.next();
			      distance = input.nextInt();
			      ++i;
			      String line = input.nextLine();
		 	      if(line.equals("")){
				a[i] = new Bus(busno,from,to,distance);
			      }
			      else{
				if(line == "L")
				  a[i] = new Bus(busno,from,to,distance,type.L);
				else if(line == "O")
				  a[i] = new Bus(busno,from,to,distance,type.O);
				else 
				  a[i] = new Bus(busno,from,to,distance,type.E);
			      }
			      break;
				
			case 2:
			      for(j = 1;j <= i;++j)
				 a[j].Show();
			      break;
		     }
		}
	}
}
			      
