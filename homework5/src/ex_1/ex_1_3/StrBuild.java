package ex_1.ex_1_3;

import java.util.Scanner;

public class StrBuild {
    public StrBuild(StringBuilder result, Scanner scanner) {
        this.result = result;
        this.scanner = scanner;
    }

    StringBuilder result;
    Scanner scanner;
    void strBuilder(){
        System.out.println("Введите строки (для завершения ввода сторок введите 'end'):");

        while (true) {
            String strEnter = this.scanner.nextLine();
            if (strEnter.equals("end")) {
                break;
            }
            this.result.append(strEnter).append(" ");
        }

        System.out.println("Результат:");
        System.out.println(this.result.toString());

        this.scanner.close();
    }
}
