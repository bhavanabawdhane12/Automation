package functions;

public class User2 {

	public static void main(String[] args) {
		
		Car car1=new Car("Swift","Sedan",4,"White");
		/*car1.name="Swift";
		car1.model="sedan";
		car1.color="White";
		car1.wheels=4; */
		car1.transport();
		car1.specification();
		
		Car car2=new Car("I20","Megan",4,"Black");
		/*car2.name="I20";
		car2.model="magna";
		car2.color="Black";
		car2.wheels=4; */
		car2.transport();
		car2.specification();
		
	}

}

