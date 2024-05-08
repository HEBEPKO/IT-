package org.resurses.try_catch;

public class Calculator{

    public Calculator() {
    }

    public static void remainderOfTheDivision(int dividend, int divider) {
        try {
            int remainder = dividend/divider;
            System.out.printf("Остаток от деления %d на %d равен %d\n", dividend,divider,remainder);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
