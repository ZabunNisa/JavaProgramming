package day40_FinalKeyword;

public class FinalVariable {


    final  String birthDay; //use by creating instance obj - contructor:
    final static String name;

    static {
        name = "Batch 25";
    }
    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
       // pi = 4.14; final var. can't b reaasigned
        //pi = 5.4;


        final String name;
        name ="Java";

        // name = "Wooden Spoon"
        System.out.println(name);


        System.out.println("________________________________________");

        FinalVariable obj = new FinalVariable("May/10");
        //obj.birthDay = "June/23"; final variable can't be reaasigned

        System.out.println(obj.birthDay);

        System.out.println("________________________________________");

        //FinalVariable.name ="Python"


        System.out.println(FinalVariable.name);



    }
}
