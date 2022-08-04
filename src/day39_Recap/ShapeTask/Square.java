package day39_Recap.ShapeTask;

public class Square extends Shape{

    //any var can't be inhertiaed from shape class to square class:

    private double side;

    //generate gets&setters so can be used write/read in other classes:

    public double getSide() {


        return side;
    }

    public void setSide(double side) {

        if (side <= 0){
            System.err.println(" Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }
//constructor called parent class and set the side:
    public Square(double side) { //removed square
        super("Square");
        setSide(side); //need to add this setter to check the req
    }


    //override: need right area & peri of square:


    @Override
    public double area() { return side * side; }

    @Override
    public double perimeter() { return side * 4;}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}



/*
        Shape:
        	variables:
        			name

        	Encapsulate the field

        	Add a constructor to set the filed

        	Methods:
        		area(){}
        		perimeter(){}

        		*/