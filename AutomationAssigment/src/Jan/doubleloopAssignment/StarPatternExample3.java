package Jan.doubleloopAssignment;

public class StarPatternExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}



/*output

     *
    **
   ***
  ****
 *****
******


*/