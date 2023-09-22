package Package.com.defaultMethod;
//default method inside interface
interface Parent{
	default void Hello() {
		System.out.println("Hello");
	}
}
class Child implements Parent{
	
}

public interface Myclass {
	public static void main(String[] args) {
		Child C=new Child();
		C.Hello();
		
	}

}
