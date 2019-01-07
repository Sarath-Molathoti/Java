import java.util.Scanner;
class account{
	String account_holder_name;
	int Balance;
	int credit(int x){
	    Balance = Balance + x;
	    return Balance;
	}
	int debit(int x){
	    Balance = Balance - x;
	    return Balance;
	}
}
class SBI extends account{
	void calculate_interest(int i){
	     System.out.println(((i / 100) * 8));	     
	}	
}
class HDFC extends account{
	void calculate_interest(int i){
	    System.out.println(((i / 100) * 7));
	}	
}
public class Assignment1_Q8{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		SBI a = new SBI();
		HDFC b = new HDFC();
		System.out.println("Enter sbi customer details ");
	        a.account_holder_name = input.next();
		a.Balance = input.nextInt();
		a.Balance = a.credit(input.nextInt());
		a.Balance = a.debit(input.nextInt());
		System.out.println("Enter HDFC customer details ");
		b.account_holder_name = input.next();
		b.Balance = input.nextInt();
		b.Balance = b.credit(input.nextInt());
		b.Balance = b.debit(input.nextInt());
	        System.out.print(a.account_holder_name + " " + a.Balance + " ");
		a.calculate_interest(a.Balance);
	        //System.out.print("\n");
		System.out.print(b.account_holder_name + " " + b.Balance + " ");
		b.calculate_interest(b.Balance);
		//System.out.print("\n");
		
	}
}
		
