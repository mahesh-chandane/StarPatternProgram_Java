package PatternProgram;

public class PatternTemple
{
  public static void main(String[] args)
  {
	for(int i=1; i<=4; i++)
	{
		for(int j=i; j<=3; j++)
		{
			System.out.print(" ");
		}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=1; l<i; l++)
			{
				System.out.print("*");
			}			
			System.out.println();
	        }
	
			for(int m=1; m<=3; m++)
			{
				for(int n=1 ; n<=7; n++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}
}
  

