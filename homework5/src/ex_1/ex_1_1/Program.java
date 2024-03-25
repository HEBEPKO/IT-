/*
* 1.1. Сравнить две строки: "Мама мыла раму" и "Мама" + " мыла " + "раму" при помощи оператора ==
* и получить результаты сравнения true.
* */
package ex_1.ex_1_1;

public class Program {
    public static void main(String[] args) {
        String string = "Мама" + " мыла " + "раму";
        String string3 = "Мама" + " " + "мыла" + " " + "раму";
        String string1 = "Мама мыла раму";
        System.out.println(string == string1);
        System.out.println(string == string3);
        System.out.println(string1 == string3);
    }
}
