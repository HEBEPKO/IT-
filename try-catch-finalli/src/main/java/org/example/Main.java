package org.example;

import org.resurses.try_catch.Calculator;
import org.resurses.try_catch_finalli.CalculatorFinally;
import org.resurses.try_finally.CalculatorTryFinally;

public class Main {
    public static void main(String[] args) {
        Calculator.remainderOfTheDivision(4,2);
        Calculator.remainderOfTheDivision(6,4);
        Calculator.remainderOfTheDivision(21,0);
        CalculatorFinally.remainderOfTheDivision(21,0);
        CalculatorTryFinally.remainderOfTheDivision(21,0);
    }


}