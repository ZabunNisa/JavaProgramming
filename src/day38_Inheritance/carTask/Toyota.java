package day38_Inheritance.carTask;

public class Toyota extends Car { // Toy is ingertied from parent class

    //how to call constructor from parent call to child class -const call constr:


    public Toyota( String model, int year, double price, String colour, int miles) {
        super("Toyota", model, year, price, colour, miles);
    }


    // create objs 4 class- need to pass6 paras: brand, year etc:
    // can remove unnessary paras if there's no argument: the brans is alawys toyato therefore can remove it.

    // sub class can add it's own fields: cos not inhertied from patent class:


    public void reliable(){
        System.out.println(brand+ " "+model+ " is reliable");

    }


}
/*Toyota:
					extra methods:
							reliabile()
*/