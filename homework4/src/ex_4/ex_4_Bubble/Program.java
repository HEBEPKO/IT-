//2.Создать массив int[100_000].
//        Заполнить его случайными числами.
//        Выполнить сортировку пузырьком.
//        Через консоль получить два числа, разделённых пробелом - это будут начальный и конечный индексы.
//        И вывести на экран часть массива, ограниченного полученными индексами.

package ex_4.ex_4_Bubble;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Bubble randomNumber = new Bubble(10);

        randomNumber.fill();
        randomNumber.print();

        randomNumber.sortBubble(randomNumber.getNameArr());
        randomNumber.print();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Введите начальный и конечный индексы (разделенные пробелом):");
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        int startIndex = Integer.valueOf(s[0]);
        int endIndex = Integer.valueOf(s[1]);

        randomNumber.print(startIndex,endIndex);

        Bubble randomNum = new Bubble(10);
        randomNum.fill();
        randomNum.print();

        randomNum.sortBubble(randomNum.getNameArr(), false);
        randomNum.print();
    }
}
