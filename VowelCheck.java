import java.util.Scanner;
public class VowelCheck{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		char ch;
	        System.out.print("Enter to character for vowel check: ");
		ch = input.next().charAt(0);
		switch(ch){
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default :
			System.out.println("Not an Vowel");
		}
	}
}
			
