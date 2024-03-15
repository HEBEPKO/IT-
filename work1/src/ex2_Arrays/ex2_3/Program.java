package ex2_Arrays.ex2_3;

public class Program {
    public static void main(String[] args) {
        Array array;
        array = new Array(new String[]{"1", "2", "7", "12", "55", "nul", "7", "99", "9", null});
        Array array2;
        array2 = new Array(new String[]{null, "2", "7", "12", "55", "nul", "7", "99", "9", null});
        array.displayFor();
        array.displayDoWhile();
        array2.displayWhile();
    }
}
