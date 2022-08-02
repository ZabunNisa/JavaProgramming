package day38_Inheritance.carTask;

public class Tesla extends Car{


    // Nw with const - don't need to set the intances each time:
    public Tesla( String model, int year, double price, String colour, int miles) {
        super("Tesla", model, year, price, colour, miles);
    }

    public void autoPilot(){

        System.out.println(brand+ " "+model+ "is in autopilot mode");
    }
}

/*3. Tesla:
					extra methods:
						autoPilot();
*/