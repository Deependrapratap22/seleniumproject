package JanAssignment;

import DecAssigment.HasToReleation;

public class Jan2Assignment3 {

	public void meth() {
		System.out.println("Defalut Method");
		this.meth(5);
	}

	public void meth(int a) {
		System.out.println("One parameter method");
		this.meth(5, 9);
	}

	public void meth(int a, int b) {
		System.out.println("Two parameter method");
	}

	public void meth(int a, int b, int c) {
		System.out.println("three parameter method");
		this.meth(5, 8, 5, 2);
	}

	public void meth(int a, int b, int c, int d) {
		System.out.println("four mparameter method");
		this.meth();
	}

	Jan2Assignment3() {
		meth(4, 5, 9);
	}

	public static void main(String[] args) {

		Jan2Assignment3 obj = new Jan2Assignment3();//Assignment 2
		Jan2Assignment2 obj2=new Jan2Assignment2();//Assignment 3
		obj2.display();
		HasToReleation obj3=new HasToReleation();//Assignment 4
		obj3.display();
		
	}

}
