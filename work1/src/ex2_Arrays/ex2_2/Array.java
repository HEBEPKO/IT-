package ex2_Arrays.ex2_2;

public class Array {
    private final int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }
    public void displayFor() {
        for (int i = 0; i <= arr.length-1; i++) {
            int num = arr[i];
            int remainder = i % 2;
            if (i != arr.length-1) {
                if (remainder == 1) {
                    System.out.printf("%d;", num);
                }
            } else {
                if (remainder != 1) {
                    System.out.print(" >>> \n");

                } else {
                    System.out.printf("%d >>> \n", num);
                }
            }

        }
    }
    public void displayDoWhile() {
        int i = 0;
        do {
            int length = arr[i];
            int remainder = i % 2;
            if (i == arr.length-1) {
                if (remainder != 1) {
                    System.out.print(" >> \n");
                    break;
                } else {
                    System.out.printf("%d >> \n", length);
                }
            } else {
                if (remainder == 1) {
                    System.out.printf("%d!", length);
                }
            }
            i ++;
        } while (i <= arr.length-1);
    }
    public void displayWhile() {
        int i = 0;
        while (i <= arr.length-1) {
            int remainder = i % 2;
            int item = arr[i];
            if (i == arr.length-1) {
                if (remainder != 1) {
                    System.out.print(" => \n");
                } else {
                    System.out.printf("%d => \n", item);
                }
            } else {
                if (remainder == 1) {
                    System.out.printf("%d:", item);
                }
            }
            i ++;
        }
    }
}
