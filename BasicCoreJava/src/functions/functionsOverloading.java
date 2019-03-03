package functions;

public class functionsOverloading {

		
		public int sum(int a, int b)
		{
			return a+b;
		}
		
		public int sum(int a, int b, int c)
		{
			return a+b+c;
		}
		
		public static void main(String[] args) {

			functionsOverloading obj= new functionsOverloading();	
			//System.out.println(obj.sum(10, 20));
			System.out.println(obj.sum(10, 20, 30));
		}

	}
