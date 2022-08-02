package day38_Inheritance.CarTask;

public class Car {

public String brand, model;
public int year; // public acn't set conditions
public double price;
public String colour;
public int miles;

    public Car(String brand, String model, int year, double price, String colour, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.miles = miles;
    }

   // instance therefore can call static:
    public void start(){

        System.out.println( brand + " " + " model  " + " is starting");

    }
    public void  drive(){

        System.out.println( brand + " " + " model " + " is driving");


    }

   // to print:

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= £" + price +
                ", colour='" + colour + '\'' +
                ", miles=" + miles +
                '}';
    }








   /*
    public void fly(){
     can't inc in parentt claas cos fly() is'nt common feature to all cars

    */



    }


//testing again

    //take two



/*carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()*/