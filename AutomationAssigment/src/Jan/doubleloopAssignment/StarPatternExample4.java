package Jan.doubleloopAssignment;

public class StarPatternExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		for (i=1;i<=5;i++)
		{
			for (j=9/2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (k=1;k<=2*i-1;k++)
			{
				System.out.print("*");

				
			}

			System.out.println("");
		}

	}

}
