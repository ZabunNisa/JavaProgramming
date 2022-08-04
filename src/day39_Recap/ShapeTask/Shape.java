package day39_Recap.ShapeTask;

public class Shape {


    private String name;// other classes won't have direct access to this varaible

    //getter and setter allow other cllasses to access the varaibles: nad can be over ridden later


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null){

            System.err.println("Name can not be null");

            System.exit(1);// somethong went wrong - 1
        }



        if (name.isEmpty() || name.isBlank()){

            System.err.println("Invalid name");

            System.exit(1);// somethong went wrong - 1
        }
        this.name = name;
    }


    // constructor: when obj is created the instance - name can be
    // set

    public Shape(String name) {
       setName(name);
    }
    //can be private override cos another classes cant use it:
    public double area(){

        return 0; //implimentation
    }

    public double perimeter(){return 0;
    }

    @Override //ths will be inhertied by other classes
    public String toString() {
        return "Shape{" +
                " name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
    /*
    *
    * public String toString method diff para*/

}
/*    Shape:
        	variables:
        			name

        	Encapsulate the field

        	Add a constructor to set the filed

        	Methods:
        		area(){}
        		perimeter(){}











        		*/