package JanAssignment;

public class Jan2Assignment1 {

	
	final int abc=123;
	public Jan2Assignment1() {
		this(5, 9, 6);
		System.out.println("Default constructor");
	}

	public Jan2Assignment1(int a) {
		this(5, 8, 6, 3);
		System.out.println("one parameter constructor");
	}

	public Jan2Assignment1(int a, int b) {
		this(5);
		System.out.println("Two parameter constructor");
	}

	public Jan2Assignment1(int a, int b, int c) {

		System.out.println("Three parameter constructor");
	}

	public Jan2Assignment1(int a, int b, int c, int d) {
		this();
		System.out.println("Four parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jan2Assignment1 obj = new Jan2Assignment1(5, 9);
		System.out.println("Value=>"+obj.abc);
	}

}
