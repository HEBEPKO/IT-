package ex_4_ArrayList;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();
        System.out.println(arrayList1);
        arrayList1.add(0, 2);
        arrayList1.toString();
        MyArrayList arrayList = new MyArrayList<>();
        arrayList.toString();
        arrayList.add(10);
        arrayList.toString();
        int[] arr= {1,2,3};

        arrayList.addAll(arr);
        arrayList.toString();
    }
}
