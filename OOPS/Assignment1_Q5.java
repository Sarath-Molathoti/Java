import java.util.Scanner;
class person{
	String name;
	int age;	
}
class emp extends person{
	String emp_id;
	int salary;	
}
class manager extends person{
	String managing_dep;
	int No_of_employees_working_under;	
}
public class Assignment1_Q5{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int n,i;
	System.out.print("Enter number of managers ");
	n = input.nextInt();
	emp[] array1 = new emp[n];
	manager[] array2 = new manager[n];
	for(i = 0;i < n;i = i + 1){
	   array1[i] = new emp();
	   array2[i] = new manager();
	   array1[i].name = input.next();    //It(next()) is used to get the next complete token from the Scanner which is in use.
	   array1[i].age = input.nextInt();
	   array1[i].emp_id = input.next();
	   array1[i].salary = input.nextInt();
	   array2[i].managing_dep = input.next();
	   array2[i].No_of_employees_working_under = input.nextInt();
	}
	for(i = 0;i < n;i = i + 1){
	   System.out.print(array1[i].name + " ");
	   System.out.print(array1[i].age + " ");
	   System.out.print(array1[i].emp_id + " ");
	   System.out.print(array1[i].salary + " ");
	   System.out.print(array2[i].managing_dep + " ");
	   System.out.println(array2[i].No_of_employees_working_under + " ");
	}
	}
}

	
	
	

	
