package conditionalstatments;

public class Testing4 {

	public static void main(String[] arg)
	{
		int a=40;
		int b=20;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		else
		{
			System.out.println("t");
		}
		
		if(a>b || b>c)
		{
			System.out.println("a");
		}
	}
}
