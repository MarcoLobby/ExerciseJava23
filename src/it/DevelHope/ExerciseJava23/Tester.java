package it.DevelHope.ExerciseJava23;

/**
 * @author Marco Lo Bello
 * This class is where the code starts using the main function.
 */

public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(1,2));
        System.out.println(arithmeticOperators.sub(2,1));
        System.out.println(arithmeticOperators.mul(3,5));
        System.out.println(arithmeticOperators.div(500,10));
    }
}
