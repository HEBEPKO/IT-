package org.resurse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList testMyArrayList;

    @BeforeEach
    void init() {
        testMyArrayList = new MyArrayList();
        Person personTest1 = new Person("first", 10);
        Person personTest2 = new Person("second", 20);
        Person personTest3 = new Person("third", 30);
        testMyArrayList.add(personTest1);
        testMyArrayList.add(personTest2);
        testMyArrayList.add(personTest3);
    }

//    @Test
//    void add() {
//        int initSize = testMyArrayList.getSize();
//        testMyArrayList.add(new Object());
//        int resultSize = testMyArrayList.getSize();
//        System.out.println("Тест успешен:\n  начальный размер массива = " + initSize + " конечный размер массива = " + resultSize);
//        assertEquals(initSize + 1, resultSize);
//    }


    @ParameterizedTest
    @MethodSource("add")
    void addElement(int initSize, int result, Object object, String messeng) {
        testMyArrayList.add(object);
        System.out.printf(messeng, initSize, result);
        assertEquals(initSize + 1, result);
    }

    static Stream<Object> add() {
        return Stream.of(Arguments.of(1, 2, new Person("second", 20),
                        "Тест успешен:\n  начальный размер массива = %d, конечный размер массива = %d\n"),
                Arguments.of(6, 7, new Object(),
                        "Тест успешен:\n  начальный размер массива = %d, конечный размер массива = %d\n"),
                Arguments.of(100, 101, 1,
                        "Тест успешен:\n  начальный размер массива = %d, конечный размер массива = %d\n"),
                Arguments.of(50, 51, "element",
                        "Тест успешен:\n  начальный размер массива = %d, конечный размер массива = %d\n"));
    }


    @ParameterizedTest
    @MethodSource("addAll")
    void addArrElem(int initSize, int result, Object[] objects, String messing) {
        int length = objects.length;
        testMyArrayList.addAll(objects);
        System.out.printf(messing, initSize, length, result);
        assertEquals(initSize + length, result);
    }

    static Stream<Object> addAll() {
        return Stream.of(Arguments.of(1, 4, new Person[]{new Person(),new Person(),new Person()},
                        "Тест успешен:\n  начальный размер массива = %d, добовляем массив объектов типа Person дилинной = %d, конечный размер массива = %d\n"),
                Arguments.of(6, 13, new Integer[]{1324,2434,3345,43453,5345,6345,7345},
                        "Тест успешен:\n  начальный размер массива = %d, добовляем массив объектов типа Object дилинной = %d, конечный размер массива = %d\n"),
                Arguments.of(100, 103, new Object[]{new Object(),new Object(),new Object()},
                        "Тест успешен:\n  начальный размер массива = %d, добовляем массив объектов типа String дилинной = %d, конечный размер массива = %d\n"),
                Arguments.of(50, 90, new String[]{new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),
                                new String(),new String(),new String(),new String(),},
                        "Тест успешен:\n  начальный размер массива = %d, добовляем массив объектов типа String дилинной = %d, конечный размер массива = %d\n"));
    }

    @Test
    void addAtIndex() {
        int initSize = testMyArrayList.getSize();
        Object personTest4 = new Object();
        testMyArrayList.addAtIndex(2, personTest4);
        int resultSize = testMyArrayList.getSize();
        System.out.println("Тест успешен:\n  начальный размер массива = " + initSize + " конечный размер массива = " + resultSize);
        assertEquals(personTest4, testMyArrayList.getElement(2));
    }

    @Test
    void removeAtIndex() {
        testMyArrayList = new MyArrayList();
        Person personTest1 = new Person("first", 10);
        Person personTest2 = new Person("second", 20);
        Person personTest3 = new Person("third", 30);
        testMyArrayList.add(personTest1);
        testMyArrayList.add(personTest2);
        testMyArrayList.add(personTest3);

        int initSize = testMyArrayList.getSize();

        testMyArrayList.removeAtIndex(2);

        int resultSize = testMyArrayList.getSize();
        System.out.println("Тест успешен:\n  начальный размер массива = " + initSize + " конечный размер массива = " + resultSize);
        assertNotEquals(personTest2, testMyArrayList.getElement(2));
    }

    @Test
    void clear() {
        int initSize = testMyArrayList.getSize();
        Object personTest4 = new Object();
        Object personTest5 = new Object();
        Object personTest6 = new Object();
        Object personTest7 = new Object();
        Object[] arrPersonTest = new Object[]{personTest4, personTest5, personTest6, personTest7};
        testMyArrayList.addAll(arrPersonTest);
        testMyArrayList.clear();
        int resultSize = testMyArrayList.getSize();
        System.out.println("Тест успешен:\n  начальный размер массива = " + initSize + " конечный размер массива = " + resultSize);
        assertEquals(resultSize, 0);
    }
}