package PatternProgram;

public class PatternTemple2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++)
		{
			for(int j=i; j<=2; j++)
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
		
				for(int m=1; m<2; m++)
				{
					for(int n=1 ; n<=5; n++)
					{
						System.out.print("*");
					}
					System.out.println();	
			    }
				
				for(int i=1; i<=3; i++)
				{
					for(int j=1; j<=i; j++)
					{
						System.out.print(" ");
					}
						for(int k=i; k<3; k++)
						{
							System.out.print("*");
						}	
						for(int l=i; l<2; l++)
						{
							System.out.print("*");
						}		
						

						System.out.println();
		}
	}
}
	  
	