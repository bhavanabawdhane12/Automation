package functions;

public class Car {

	String name;
	int wheels;
	String model;
	String color;
	
	public Car(String name, String model1, int wheels1, String color1)
	{
		this.name=name;
		model=model1;
		wheels=wheels1;
		color=color1;
	}
	
	public Car()
	{
		
	}
	public static void drive()
	{	//Car c=new Car();
		//System.out.println("The Hexa Car of model xyz have 4 wheels in grey color");
		//System.out.println("The " +c.name+ " Car of model " +c.model+ " have " +c.wheels+ " wheels in " +c.color+ " color");
	}
	
	public void transport()
	{
		//System.out.println("The Hexa Car transport passengers from Pune to Mumbai");
		System.out.println("The "+name+" Car transport passengers from Pune to Mumbai");
	}
	
	public void specification()
	{
		System.out.println("The " +name+ " Car of model " +model+ " have " +wheels+ " wheels in " +color+ " color");
	}
}
