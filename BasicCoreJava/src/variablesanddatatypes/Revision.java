package variablesanddatatypes;

public class Revision {

	public static void main(String[] args) {
		
		int a= 10;
		int b=20;
// loops
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		// condition
			
		if(a>b)
		{
			System.out.println("a is greatest");
		}
		else
		{
			System.out.println("b is the greatest");
		}
		
		//Array
		String[] str= new String[3];
		str[0]="Bhavana";
		str[1]="Bawdhane";
		str[2]="ComputerScience";
		
		
		//10, true, Bawdhane
		
		Object[] obj=new Object[3];
		obj[0]=10;
		obj[1]=true;
		obj[2]="Bhavana";
	}

}
