package ex_1_2;

import java.util.Scanner;

public class ProgramString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какую-нибудь фразу: ");
        OutStringSymbol str = new OutStringSymbol(scanner.nextLine());
        System.out.println("Мы разделили вашу фразу посимвольно через ';' :");
        str.outStringSymbol();
        scanner.close();
    }
}
