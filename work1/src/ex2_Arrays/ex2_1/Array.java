package ex2_Arrays.ex2_1;

public class Array {
    private int arr[];

    public int[] getArr(int[] arr) {
        return arr;
    }
    public Array(int arr[]) {
        this.arr = arr;
    }
    public void DisplayFor() {
        for (int i = arr[0]; i <= arr.length; i++) {
            if (i != arr.length) {
                System.out.printf("%d;", i);
            } else {
                System.out.printf("%d >>> \n", i);
            }

        }
    }
    public void DisplayDoWhile() {
        int length = arr[0];
        do {
            if (length == arr.length) {
                System.out.printf("%d >> \n", length);
            } else {
                System.out.printf("%d!", length);
            }
            length ++;
        } while (length <= arr.length);
    }
    public void DisplayWhile() {
        int length = arr[0];
        while (length <= arr.length) {
            if (length == arr.length) {
                System.out.printf("%d => \n", length);
            } else {
                System.out.printf("%d:", length);
            }
            length ++;
        };
    }
    public void DisplayForeach() {
        System.out.print("|");
        for (int num:arr){
            System.out.print(num+"|");
        }
        System.out.print(".");
    }
}
