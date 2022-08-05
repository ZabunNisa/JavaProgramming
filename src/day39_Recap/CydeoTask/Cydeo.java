package day39_Recap.CydeoTask;

public class Cydeo {


    public static void main(String[] args) {

        Developer developer = new Developer("Sahb", 23,'F',2,"Java Deveope", 23333);

        Tester tester = new Tester("Zebs", 44,'M',4,"SDET",2222);

        Teacher teacher = new Teacher("Rif",34,'F', '6',"Science Teacher",8332);



        Student student =new Student("Zah",43,'M',7,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("__________________________________________________");


        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("__________________________________________________");

        //created one method and over ridding in sub class
        developer.work();
        tester.work();
        teacher.work();
        //student.work()


        System.out.println("__________________________________________________");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("__________________________________________________");


        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        //tester.fixingBugs();

        System.out.println("__________________________________________________");


        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.createTicket();
        //teacher.fixingBugs();




        System.out.println("__________________________________________________");


        student.eat();
        student.drink();
        student.sleep();
        //student.createTicket();
        //student.fixingBugs();
        student.study();









    }
}
