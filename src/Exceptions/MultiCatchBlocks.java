package Exceptions;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {


    public static void main(String[] args) {


        Employee employee = null;

        try {

            System.out.println(employee.getSalary()); // null pointer Expection

        }catch (NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Forth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block"); // 4th got excueted and catches
            e.printStackTrace();
        }

        System.out.println("Test completed ");

        System.out.println("__________________________________________________________________");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){

            e.printStackTrace();
        }
    }

}
