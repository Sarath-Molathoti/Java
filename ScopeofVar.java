public class ScopeofVar {
	public static void main(String args[]){
		int a = 3;
		int b = 5;
		if(a == 3){//any variables declared inside this if block are unknown to outside if block  
		   //int b = 4;int c = 6; known only to this block
		  System.out.println("b value inside if loop : " + b);
		}
		//c = 7; c is unknown 
		System.out.println("b value outside if loop : " + b);
	}
}
