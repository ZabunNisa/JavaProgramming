package utilities;

import day40_FinalKeyword.protectedAccessModifier;

public class AccessModifier_Test4 extends protectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println( AccessModifier_Test4.name1 );//default is'nt visible outside the pack.
        System.out.println( AccessModifier_Test4.name2 );//protected is visible outside pack in sub

        //AccessModifier_Test4.method1(); //default

        AccessModifier_Test4.method2();//protected

    }
}
