
import java.util.*;
import java.util.function.*;

// Functional Interface with single abstract method
@FunctionalInterface
interface MathOperation {

    int operate(int a, int b);

}

public class Sample {

    // passing lambdas as arguments to method
    private static int calc(int a, int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }

    // using function interface to pass lambdas as arguments
    // takes only one argument
    private static int calc(int a, Function<Integer,Integer> mathOperation){
        // apply method takes an argument and returns a result
        return mathOperation.apply(a);
    }

    public static void main(String[] args) {

        // Type 1
        MathOperation addition = (a,b) -> a + b;
        MathOperation subtraction = (a,b) -> a - b;
        System.out.println(addition.operate(5,5));
        System.out.println(subtraction.operate(6,5));

        // Type 2
        // using calc method and sending lambda as an argument
        System.out.println(calc(5,5,addition));
        System.out.println(calc(6,5,subtraction));

        // Type 3
        // using function interface to pass lambdas as arguments
        Function<Integer,Integer> addition2 = a -> a + 5;
        Function<Integer,Integer> subtraction2 = a -> a - 5;
        System.out.println(calc(5,addition2));
        System.out.println(calc(6,subtraction2));

    }
}
