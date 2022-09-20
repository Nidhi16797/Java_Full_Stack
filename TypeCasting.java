package mypackage;

public class TypeCasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit conversion");
		char a='A';
		System.out.println("Value of a:"+a);
		int b='a';
		System.out.println("Value of b:"+b);
		float c='b';
		System.out.println("Value of c:"+c);
		long d='c';
		System.out.println("Value of d:"+d);
		double e='d';
		System.out.println("Value of e:"+e);
		
		System.out.println("..........................");
		System.out.println("Explicit conversion");
		
		double x=45.6;
		int y=(int) x;
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		
		int z=10;
		int i=15;
		System.out.println(z<<2);
		
		
		
		
		
	}
}
