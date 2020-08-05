package array;

import java.util.Arrays;

public class DinamicArray {
    public static void test(TestArray[] a) {
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args) {
        System.out.println("Динамическое создание агргументов");
        test(new TestArray[] {new TestArray(), new TestArray()});
        System.out.println("Груповая инициализация");
        TestArray[] arrayGroup = {new TestArray(), new TestArray(), new TestArray(), new TestArray()};
        test(arrayGroup);
        System.out.println("Груповая динамическая инициализация");
        TestArray[] arrayDinamic;
        arrayDinamic = new TestArray[] {new TestArray(), new TestArray(), new TestArray()};
        test(arrayDinamic);
        System.out.println("Инициализация null");
        TestArray[] arrayDinamicTest = new TestArray[5];
        test(arrayDinamicTest);
    }
}