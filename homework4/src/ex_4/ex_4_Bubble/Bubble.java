//2.Создать массив int[100_000].
//        Заполнить его случайными числами.
//        Выполнить сортировку пузырьком.
//        Через консоль получить два числа, разделённых пробелом - это будут начальный и конечный индексы.
//        И вывести на экран часть массива, ограниченного полученными индексами.

package ex_4.ex_4_Bubble;

import java.util.Random;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int[] randomNumbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt();
        }
        sortBubble(randomNumbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальный и конечный индексы (разделенные пробелом):");
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        int i1 = Integer.valueOf(s[0]);
        int i2 = Integer.valueOf(s[1]);
        for (int i = i1; i < i2; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

//        function sortArr(arr) {
//                arr.sort((a, b) => {
//                let sort = a[sortColumnFlag] < b[sortColumnFlag];
//        if (sortDirFlag === false) sort = a[sortColumnFlag] > b[sortColumnFlag];
//        return sort ? -1 : 1;
//        });


    }
    public static void sortBubble(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
}
