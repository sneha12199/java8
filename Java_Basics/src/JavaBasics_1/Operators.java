package JavaBasics_1;

public class Operators {

	public static void main(String[] args) {
		int a=23;
		int b=22;
	
			//Arithmetic operators> +,-,*,%,/
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Sum of a and b is:"+(b-a));
		System.out.println("Sum of a and b is:"+(a*b));
		System.out.println("Sum of a and b is:"+(a/b));
		System.out.println("Sum of a and b is:"+(a%b));
//Relational operators always returns boolean value
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		//Logical Operators
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);

		System.out.println(!x);

		System.out.println(!y);
		//increment or decrement operator;
		a=100;
		a=a-1;
		a=a--;
		System.out.println(a);
		

	}

}
