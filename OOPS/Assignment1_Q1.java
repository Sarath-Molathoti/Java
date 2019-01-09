import java.util.Scanner;
import java.lang.Math; 
class Student_Details{
	String Name;
	String Roll_No;
	int cgpa;
	int percentage;
	int Percentage(){
	    percentage = (int) (Math.ceil(cgpa * 9.285));
	    return percentage;
	}
}
public class Assignment1_Q1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n,i;
		System.out.print("Enter number of students ");
		n = input.nextInt();
		Student_Details[] array = new Student_Details[n];
		System.out.println("Student Details ");
		for(i = 0;i < n;i = i + 1){
		   array[i] = new Student_Details();
		   array[i].Name = input.next();    //It(next()) is used to get the next complete token from the Scanner which is in use.
		   array[i].Roll_No = input.next();
		   array[i].cgpa = input.nextInt();
		   array[i].percentage = array[i].Percentage();
		}
		for(i = 0;i < n;i = i + 1){
		   System.out.print(array[i].Name + " ");
		   System.out.print(array[i].Roll_No + " ");
		   System.out.print(array[i].cgpa + " ");
		   System.out.println(array[i].percentage + "% ");
		}
		
	}
}
