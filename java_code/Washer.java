class helloException extends Exception {}
public class Washer{
	public void foo() throws helloException{
		throw new helloException();
		
	}

	public static void main(String [] argss ) throws helloException{
	//public static void main(String [] argss ){
	System.out.println("hello");
	}

}
