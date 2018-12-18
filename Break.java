import java.util.Scanner;
public class Break{
	public static void main(String args[]){
		int i,j,k;
		one : {
		Two :   {
		Three :   {
			for(i = 0;i <= 5;++i){
			   System.out.println(i);
			   if(i == 3) break Three;
			}
		          }
			System.out.println("After Three label");
		        for(i = 0;i <= 5;++i){
			   System.out.println(i);
			   if(i == 2) break Two;
			}
		        }
			System.out.println("After Two label");
			 for(i = 0;i <= 5;++i){
			   System.out.println(i);
			   if(i == 1) break one;
			 }
		      }
	}
}
	
