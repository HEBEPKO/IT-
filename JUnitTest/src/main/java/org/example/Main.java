package org.example;

import org.resurse.MyArrayList;
import org.resurse.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(8);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(5);
        MyArrayList testMyArrayList = new MyArrayList();
        Person personTest1 = new Person("first", 10);
        testMyArrayList.add(personTest1);
        testMyArrayList.print();
        myArrayList.addAll(new Object[]{1, 2, 3, 4, 5, 6, 7, 8});
        myArrayList.print();
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
    }
}