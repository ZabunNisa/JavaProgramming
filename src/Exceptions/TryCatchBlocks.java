package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {


    public static void main(String[] args) {


        System.out.println("Test1 started");

        try { //  try block can only detect if occurs during cpmplie time

            System.out.println(9 / 0); // prog terminatied

            System.out.println("Try Block");

        } catch (ArithmeticException e){
            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception is caught");
        }


        System.out.println("Test1 completed");

        System.out.println("___________________________________________________");

        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]); //exception obj

            System.out.println("Try block");

        }catch (RuntimeException e){ //catch block handles excption


            e.printStackTrace(); //preferred method - good for created reports
            //System.out.println("Catch Block");
            //System.out.println("Runtime Exception occurred");
            // System.out.println(e.getMessage());

        }
        System.out.println("Test2 finished");


        System.out.println("___________________________________________________");

        System.out.println("Test3 started");

        try {System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test3 finished");

         //unchekced exp

        System.out.println("___________________________________________________");


        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");
        System.out.println("___________________________________________________");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}