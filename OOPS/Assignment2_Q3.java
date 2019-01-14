import java.util.Scanner;
enum Time{Day,Night}
interface salaryFinder{
	public void findSalary();
}
class person{
	String name;
	int age;
}
class Employee extends person{
	int emp_id;
	public int salary_per_day,salary,No_of_days_present;
}
class Security extends Employee implements salaryFinder{
	Time time;
	public void findSalary(){
	     salary = salary_per_day * No_of_days_present;
	}
}
class Teacher extends Employee{
	String Branch,Specialization;
}
class HOD extends Teacher implements salaryFinder{
	int number_of_Teachers_working_under,number_of_guideship;
        HOD(String name,int age,int emp_id,int salary_per_day,int No_of_days_present,String Specialization,String Branch,int number_of_Teachers_working_under,int number_of_guideship){
	   this.name = name;
	   this.age = age;
	   this.emp_id = emp_id;
	   this.salary_per_day = salary_per_day;
           this.No_of_days_present = No_of_days_present;
	   this.Specialization = Specialization;
	   this.Branch = Branch;
	   this.number_of_Teachers_working_under = number_of_Teachers_working_under;
	   this.number_of_guideship = number_of_guideship;
	}
	
	public void findSalary(){
	     salary = salary_per_day * No_of_days_present;
	}
}
public class Assignment2_Q3{
 	public static final String[] units = { ""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"}; 
 	public static final String[] doubles = {" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
 	public static final String[] tens = {"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
 	public static final String[] hundreds = {"", " thousand"," million"," billion"};
public static String convertToWord(int number) { 
 	String word = ""; 
	int index = 0;
        do {
	// take 3 digits at a time
	int num = number % 1000;
 	if (num != 0){
 	   String str = convertThreeOrLessThanThreeDigitNum(num);
 	   word = str + hundreds[index] + word;
 	}
	index++;
 	// move left by 3 digits
 	number = number/1000;
 	} while (number > 0);
 	return word;
}
public static String convertThreeOrLessThanThreeDigitNum(int number) {
 	 String word = ""; 
  	 int num = number % 100;
         // Logic to take word from appropriate array
 	 if(num < 10){
 	 word = word + units[num];
 	 }
 	 else if(num < 20){
 	 word = word + doubles[num%10];
 	 }else{
 	 word = tens[num/10] + units[num%10];
 	 }
  	 word = (number/100 > 0)? units[number/100] + " hundred" + word : word;
  	 return word;
}
//public class Assignment2_Q3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int n = 0,i = 0,j = 0,k,l;
		HOD[] a1 = new HOD[100];
		Security[] a2 = new Security[100];
		while(n != 5){
		     System.out.println("1- Insert HOD details\n2- Insert security details\n3- Display HOD details\n4- Display Security details\n5 – Exit");
		     System.out.print("Enter choice ");
		     n = input.nextInt();
		     switch(n){
			case 1:
			      System.out.println("Enter details of HOD (name , age, emp_id, salary_per_day, No_of_days_present, specialization ,department, number_of_Teachers_working_under, number_of_guideship)");
			      i = i + 1;
			      a1[i] = new HOD(input.next(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.next(),input.next(),input.nextInt(),input.nextInt());
			     /* a1[i].name = input.next();
			      a1[i].age = input.nextInt();
			      a1[i].emp_id = input.nextInt();
		              a1[i].salary_per_day = input.nextInt();
			      a1[i].No_of_days_present = input.nextInt();
		  	      a1[i].Specialization = input.next();
			      a1[i].Branch = input.next();
			      a1[i].number_of_Teachers_working_under = input.nextInt();
			      a1[i].number_of_guideship = input.nextInt();*/		      
			      break;	
			case 2:
			      System.out.print("Enter details of Security (name , age, emp_id, salary_per_day, No_of_days_present, shift)");
			      j = j + 1;
			      a2[j] = new Security();
			      a2[j].name = input.next();
			      a2[j].age = input.nextInt();
			      a2[j].emp_id = input.nextInt();
		              a2[j].salary_per_day = input.nextInt();
			      a2[j].No_of_days_present = input.nextInt();
			      String t = input.next();
			      if(t == "Day")
				a2[j].time = Time.Day;
			      else
				a2[j].time = Time.Night;
			      break;
			case 3:
			      for(k = 1;k <= i;++k){
				 System.out.print(a1[k].name + " ");
			         a1[k].findSalary();
				 System.out.println(a1[k].salary);
				 String sl1 = convertToWord(a1[k].salary);
				 System.out.println(sl1);
			      }
			      System.out.print("\n");
			      break;
			case 4:
			      for(l = 1;l <= j;++l){
				 System.out.print(a2[l].name + " ");
			         a2[l].findSalary();
				 System.out.print(a2[l].salary + " ");
				 String sl2 = convertToWord(a2[l].salary);
				 System.out.println(sl2);
			      }
			      System.out.print("\n");
			      break;
		     }
		}
	}
}

			      
