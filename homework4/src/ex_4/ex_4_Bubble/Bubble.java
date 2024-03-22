package ex_4.ex_4_Bubble;

import java.util.Random;

public class Bubble implements Sort{
    private int size;
    private int[] nameArr;

    public int[] getNameArr() {
        return nameArr;
    }

    public void setNameArr(int[] nameArr) {
        this.nameArr = nameArr;
    }

    public Bubble(int size) {
        nameArr = new int[size];
    }
    Random random = new Random();

    public void fill(){
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = random.nextInt();
        }
    }
    public void fill(int a, int b){
        for (int i = 0; i < nameArr.length; i++) {
            nameArr[i] = random.nextInt(a,b);
        }
    }

    public void print(){
        System.out.print("{");
        for (int i = 0; i < nameArr.length; i++) {
            System.out.print(nameArr[i] + " ");
        }
        System.out.print("}");
        System.out.println();
    }

    public void print(int a, int b){
        System.out.println("Выведена часть массива с начальным индексом " + a + " и конечнвым индексом " + b);
        System.out.print("{");
        for (int i = a; i <= b; i++) {
            System.out.print(nameArr[i] + " ");
        }
        System.out.print("}");
        System.out.println();
    }
}
