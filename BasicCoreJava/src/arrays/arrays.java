package arrays;

public class arrays {
	
	public static void main(String[] arg)
	{
		String[] str=new String[4];
		
		str[0]="Bhavana";
		str[1]="Nimitha";
		str[2]="Pooja";
		str[3]="Tiliksha";
		
		System.out.println(str[3]);
		System.out.println(str.length);
		
		/* for(int i=0; i<str.length ; i++)
		{
			System.out.println(str[i]);
		} */
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
