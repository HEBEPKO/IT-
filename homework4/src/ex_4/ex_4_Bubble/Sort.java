package ex_4.ex_4_Bubble;

/**
 * при вызове метода передать в него массив
 * позволяет отсортировать массив по возрастанию
 */

public interface Sort {
    boolean flag = true;
    default void sortBubble(int[] num) {
        for (int i = 0; i < num.length  - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    default void sortBubble(int[] num, boolean flag) {
        for (int i = 0; i < num.length  - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (flag == true) {
                    if (num[j] > num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                } else {
                    if (num[j] < num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }

            }
        }
    }

}
