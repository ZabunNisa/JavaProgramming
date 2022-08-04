package day39_Recap.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

       Square square = new Square(10) ;

       System.out.println(square);

       //priavte var can be access by get/set:

        square.setSide(15);
        System.out.println(square);


        System.out.println("_____________________________-");

        Rectangle rectangle= new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

       System.out.println(rectangle.getName());


        System.out.println("____________________________________");


        Circle circle = new Circle(7);
        System.out.println(circle);

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());

    }



}
