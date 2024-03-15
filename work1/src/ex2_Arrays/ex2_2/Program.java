package ex2_Arrays.ex2_2;

public class Program {
    public static void main(String[] args) {
        Array array = new Array(new int[]{1, 2, 7, 12, 5, 15, 7, 99, 9, 102, 21});
        Array array2 = new Array(new int[]{1, 2, 7, 12, 5, 15, 7, 99, 9, 102, 21, 22, 18});
        array.displayFor();
        array2.displayDoWhile();
        array.displayWhile();
    }
}
