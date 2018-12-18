//DATA TYPES IN JAVA
public class DataTypes{
	public static void main(String args[]){
		int i = 1000000000;//Integer – 32bit ranging from -2,147,483,648 to 2,147,483,648
		byte b = 100; //8-bit integer ranging from -128 to 127
		short s = 10000; //16-bit integer ranging from -32,768 to 32,768
		long l = 100000000; //64-bit integer from -9,223,372,036,854,775,808 to -9,223,372,036,854,775,808
		double d = 2.0; //Double-precision floating point, 64-bit
		float f = 2.0f; //Single-precision floating point, 32-bit,for float use f as suffix
		System.out.println("int i = " + i); 
		System.out.println("byte b = " + b); 
		System.out.println("short s = " + s); 
		System.out.println("long l = " + l); 
		System.out.println("double d = " + d); 
		System.out.println("float f = " + f); 
		char ch = 'S'; //Character , 16-bit unsigned ranging from 0 to 65,536 (Unicode)
		System.out.println("char ch = " + ch);
		ch++;
		System.out.println("ch++ = " + ch);
		ch = 9000;
		System.out.println("(ch = 90) = " + ch);
		boolean boo = true; //Can be true or false only
		System.out.println("boolean boo = " + boo); 
	}
}

