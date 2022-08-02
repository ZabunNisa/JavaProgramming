package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW( String model, int year, double price, String colour, int miles) {
        super("BMW",model, year, price, colour, miles);
    }

    public void breaksDown(){
        System.out.println(brand+ " "+model+ " breaks Down every 100 miles");

    }

    public void racing(){
        System.out.println(brand+ " "+model+ "is a racing car");

    }


}
/*carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()


			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();
*/