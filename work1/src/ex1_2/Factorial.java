package ex1_2;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        int x = print();
        System.out.printf("= %d",factorial(print()));
    }
    public static int print() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        return num;
    }

    static long factorial (int x){
        long result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
            if (i != x ) {
                System.out.printf("%d * ", i);
            } else {
                System.out.printf("%d ", i);
            }

        }
        return result;
    }
}
