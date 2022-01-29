package Jan.loopAssignment;

public class singlelooppattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------First Assignment----------");
		for (int i=0;i<=5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("----------Second Assignment----------");
		
		for (int i=0;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("----------Third Assignment----------");
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		
		System.out.println("----------Fourth Assignment----------");
		
		int num=1; 
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println("");
		}

		System.out.println("----------Fifth Assignment----------");
		
		for (int i=0;i<=5;i++)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("----------Sixth Assignment----------");
		
		
	}

}
