package Exceptions;

import day39_Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_Vs_Unchecked {

    public static void main(String[] args) {

       //unchecked  exception:

        int a=10;
        int b= 0;

       // System.out.println(a/b); // exception occured during runtime

        //System.out.println("wooden Spoon");

        char[]character = {'A', 'B','C'};
//                          0, 1, 2
     //   System.out.println(character[99]);


        Student student = null;

       // System.out.println(student.getName());
//student.study();


        String str = "Wooden Spoon";

        str = null;

        System.out.println(str.toUpperCase());

        String str2 = ""; // object !=null still exits in heap but just unknown

        System.out.println(str2.isEmpty());



        // checked Exception: require immdiate attention

        System.out.println("Hello");
       // Thread.sleep(3000); //  Checked error from method

        System.out.println("Cydeo");


       //FileInputStream file = new FileInputStream("path of file");


        System.out.println("jave".charAt(20000)); // unchecked

    }
}
