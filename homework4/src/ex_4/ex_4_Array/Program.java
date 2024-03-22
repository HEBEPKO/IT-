//1.Создать упорядоченный массив от 1_000_000 до 1_999_999.{1000000,1000001,…….,1999998,1999999}
//        Найти индекс случайного элемента в массиве при помощи бинарного поиска (своя реализация!!!).
//        Чтобы получить случайное число, воспользуйтесь кодом:
//        Random random = new Random();
//        int randomInt = random.nextInt(1_000_000,2_000_000);
//        или
//        int randomInt = (int) (Math.random()*1_000_000) + 1_000_000;

package ex_4.ex_4_Array;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] arrOrdered = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arrOrdered[i] = 1000000 + i;
        }

        Random random = new Random();
        int randomInt = random.nextInt(1000000,2000000);

        System.out.println("Индекс рандомного числа " + randomInt + " в задонном массиве равна " + searchBinary(arrOrdered, randomInt, 1000000, arrOrdered.length + 999999));
    }

    private static int searchBinary(int[] array, int indexRandom, int startIndex, int endIndex){
        int index = -1;
        int midIndex = startIndex + (endIndex - startIndex)/2;

        if (startIndex == endIndex) {
            return (startIndex == indexRandom) ? startIndex - 1000000 : -1;
        }

        if (startIndex < endIndex) {
                if (indexRandom > midIndex) {
                    startIndex = midIndex + 1;
                    return searchBinary(array, indexRandom, startIndex, endIndex);
                } else if (indexRandom < midIndex) {
                    endIndex = midIndex - 1;
                    return searchBinary(array, indexRandom, startIndex, endIndex);
                }
                return midIndex - 1000000;

        }
        return index;
    }
}
