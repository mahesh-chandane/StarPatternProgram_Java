package PatternProgram;

public class Pattern6 {
	
	public static void main(String[] args)
	{
		
		for(int i=1; i<=4; i++)
		{
		  for(int j=i; j<=3; j++)
		  {
			  System.out.print(" ");
		  }
		    for(int k=1; k<=i ; k++)
		    {
		    	System.out.print("*");
		    }
		    
			for(int l=1; l<i; l++)
			{
			  System.out.print("*");	
			}
			System.out.println();
		}
	}

}
