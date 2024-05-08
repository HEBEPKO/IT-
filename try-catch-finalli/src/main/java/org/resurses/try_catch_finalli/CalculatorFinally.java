package org.resurses.try_catch_finalli;

public class CalculatorFinally {
    public CalculatorFinally() {
    }

    public static void remainderOfTheDivision(int dividend, int divider) {
        try {
            int remainder = dividend / divider;
            System.out.printf("Остаток от деления %d на %d равен %d\n", dividend, divider, remainder);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Divider должен быть отличным от ноля");
        }

    }
}

