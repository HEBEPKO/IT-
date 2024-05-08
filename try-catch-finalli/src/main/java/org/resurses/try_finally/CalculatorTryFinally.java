package org.resurses.try_finally;

public class CalculatorTryFinally {
    public CalculatorTryFinally() {
    }

    public static void remainderOfTheDivision(int dividend, int divider) {
        try {
            int remainder = dividend / divider;
            System.out.printf("Остаток от деления %d на %d равен %d\n", dividend, divider, remainder);
        } finally {
            System.out.println("Divider должен быть отличным от ноля");
        }

    }
}
