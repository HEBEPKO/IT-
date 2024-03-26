/*Написать программу которая будет принимать строки введенные в консоли (через Scanner.in)
 и по окончанию (придумать как окончить выполнение ввода данных) вывести результат в одну строку в консоли
 */


package ex_1.ex_1_3;

import java.util.Scanner;

public class ProgramScan {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       StringBuilder stringBuilder = new StringBuilder();
       StrBuild strBuild = new StrBuild(stringBuilder, scanner);
       strBuild.strBuilder();
    }
}




