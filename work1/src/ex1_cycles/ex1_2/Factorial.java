package ex1_cycles.ex1_2;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(multiply(print()));
    }
    public static int print() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        return num;
    }

    static int multiply (int x) {
        String numberStr = Integer.toString(x);
        int result = 1;
        StringBuilder calculationSteps = new StringBuilder();

        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                result *= digit;
                calculationSteps.append(digit);
                if (i < numberStr.length() - 1) {
                    calculationSteps.append(" * ");
                }
            }
        }
        System.out.println("Ход вычислений: " + calculationSteps.toString() + " = " + result);
        return result;
    }

    static long factorial (int x){
        long result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
            if (i != x ) {
                System.out.printf("%d * ", i);
            } else {
                System.out.printf("%d ", i);
            }

        }
        return result;
    }
}
