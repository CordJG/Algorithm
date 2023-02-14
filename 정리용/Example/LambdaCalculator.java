import java.util.function.BinaryOperator;

public class LambdaCalculator {
    public static void main(String[] args) {

        int lv = 1;

        Calculable add = (a, b) -> a + b;
        Calculable subtract = (a, b) -> a - b;
        Calculable multiply = (a, b) -> a * b;
        Calculable divide = (a, b) -> a / b;

        operate(add, 10, 2);
        operate(subtract, 10, 2);
        operate(multiply, 10, 2);
        operate(divide, 10, 2);

        BinaryOperator<Integer> add1 = (a, b) -> a + b;

        operate(add1, 10, 2);

    }

    private static void operate(Calculable calculable, int a, int b) {
        System.out.println(calculable.calculate(a, b));
    }

    private static void operate(BinaryOperator binaryOperator, int a, int b) {
        System.out.println(binaryOperator.apply(a, b));
    }
}

@FunctionalInterface
interface Calculable {
    int calculate(int a, int b);
}