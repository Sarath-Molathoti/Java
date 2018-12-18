public class TypeConver {
	public static void main(String args[]){
		double a = 2.0011;
		System.out.println("a = " + a);
		long b = (long) a;
		System.out.println("(double -> long) b = " + b);
		int c = (int) b;
		System.out.println("(long -> int) c = " + c);
		int d = 4;
		double e = (double) d/c;
		System.out.println("(int -> double) e = " + e);
	}
}
		
