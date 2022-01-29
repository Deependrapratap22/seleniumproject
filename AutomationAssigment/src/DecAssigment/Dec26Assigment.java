package DecAssigment;

public class Dec26Assigment {

	int sum;
	int sub;
	int multi;
	int div;
	int finalResult;

	public int Add(int a, int b) {
		sum = a + b;
		System.out.println("Sum==>"+sum);
		return sum;
	}

	public int Sub(int a, int b) {
		sub = a - b;
		System.out.println("Sub==>"+sub);
		return sub;
	}

	public int Multi(int a, int b) {
		multi = a * b;
		System.out.println("Multi==>"+multi);
		return multi;
	}

	public int Div(int a, int b) {
		div = a / b;
		System.out.println("Div==>"+div);
		return div;
	}

	public void Assigment1() {
		System.out.println("------------Assigment1 Result------------");
		finalResult = Multi(10, 2);
		finalResult = Add(finalResult, 2);
		finalResult = Add(finalResult, 2);
		finalResult = Sub(finalResult, 2);
		finalResult = Div(finalResult, 2);
		System.out.println("Assigment 1 out put ==>" + finalResult);
	}

	public void Assigment2() {
		System.out.println("------------Assigment2 Result------------");
		finalResult = Div(10, 2);
		finalResult = Sub(finalResult, 2);
		finalResult = Add(finalResult, 2);
		finalResult = Sub(finalResult, 2);
		finalResult = Multi(finalResult, 2);

		System.out.println("Assigment 2 out put ==>" + finalResult);
	}

	public static void main(String[] args) {

		Dec26Assigment obj = new Dec26Assigment();
		obj.Assigment1();
		obj.Assigment2();
	}

}
