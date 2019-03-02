package conditionalstatments;

public class Testing2 {	//nested if
	
	public static void main(String[] arg)
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("a is the smallest");
			}
			else
			{
				System.out.println("a is less than b but less than C");
			}
		}
	}
	

}
