import java.util.Scanner;
class employ{
	String name;
	private String emp_id;
	void setId(String emp_id){
	     this.emp_id = emp_id;
	}
	String getId(){
	    return emp_id;
	}
	
}
public class Assignment1_Q6{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);	
		employ[] emp = new employ[100];
		int i,n;
		System.out.print("Enter number of employees ");
		n = input.nextInt();
		System.out.println("Enter details ");
		for(i = 0;i < n;i++){
		   emp[i] = new employ();
		   emp[i].name = input.next();	
	           emp[i].setId(input.next());
		}
		for(i = 0;i < n;i++){
		   System.out.print(emp[i].name + " ");
		   System.out.println(emp[i].getId());		
		}
		
	}
}
		   
	
