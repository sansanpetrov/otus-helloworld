package ru.otus.sansanpetrov.homework2;

import java.util.Scanner;
import java.util.Arrays;

// Создаем класс с Домашним заданием № 2
public class Hw2Massive {

    public static void printString() {
        // Выполняем пункт № 1. Применяем генератор случайных чисел.
        // В качестве множителя принимаем ввод числа от пользователя.

        // Вводим переменную для ввода выборов пользователя:
        int input = 0;
        System.out.println("Пожалуйста введите целое число и нажмите Enter:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int j = (int) (Math.random() * input);
        int[] array = new int[j];
        for (int i = 0; i < j; i++) {
            System.out.println(Arrays.toString(array));
        }

    }

    public static void sumArrayMore5() {
        // Выполняем пункт № 2.
        int input = 0;
        System.out.println("Пожалуйста введите целое число и нажмите Enter:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        int[] vector = new int[input];

        // Заполняем значения массива случайными числами и вычисляем сумму элементов,
        // значение которых больше 5-ти
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * input);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 5) {
                sum += vector[i];
            }
        }
        System.out.println("Созданный массив: " + Arrays.toString(vector));
        System.out.println("Сумма элементов массива с индексом больше 5: " + sum);
    }

    // Выполняем пункт № 3
    public static void integerEqual() {
        int integer = 33;
        int[] equal = new int[25];
        for (int i = 0; i < 25; i++) {
            equal[i] = integer;
        }
        System.out.println("Значения массива equal: " + Arrays.toString(equal));
    }

    // Выполняем пункт № 4
    public static void plusOneMore() {
        int onemore = 25;
        int onemoreplus = 4;
        int[] plus = new int[25];
        for (int i = 0; i < 25; i++) {
            plus[i] = onemore;
        }
        for (int i = 0; i < 25; i++) {
            plus[i] = plus[i] + onemoreplus;
        }
        System.out.println("Значения массива plus: " + Arrays.toString(plus));
    }

    // Выполняем пункт № 5
    public static void halfMore() {
        int sum1 = 0, sum2 =0; //Определяем начальные значения сумм половин элементов
        int[] half= new int[20];
        for (int i = 0; i < 20; i++) {
            half[i] = (int) (Math.random() * 90);
            if(i >=10) {
                sum1 += half[i]; //Сумма первой половины элементов
            }
            if(i > 10 && i <= 20) {
                sum2 += half[i]; //Сумма второй половины элементов
            }
        }
        System.out.println("Массив half:" + Arrays.toString(half));
        System.out.println("Значение sum1:" + sum1);
        System.out.println("Значение sum2:" + sum2);
        if (sum1 > sum2) {
            System.out.println("Значение сумм элементов первой половины больше");
        }
        if (sum1 < sum2) {
            System.out.println("Значение сумм элементов второй половины больше");
        }
        if (sum1 == sum2) {
            System.out.println("Значения сумм элементов первой и второй половин равны");
        }
    }

    // Запускаем основную программу со всеми методами по очереди:
    public static void main(String args[]) {
        // Начинаем выполнение второго домашнего задания.
        System.out.println("Домашнее задание № 2:");

        // Выводим метод первого параграфа
        System.out.println("Выполнение пункта 1.");
        printString();
        System.out.println("END of paragraph 1.");
        System.out.println();

        // Выводим метод второго параграфа
        System.out.println("Выполнение пункта 2.");
        sumArrayMore5();
        System.out.println("END of paragraph 2.");
        System.out.println();

        // Выводим метод третьего параграфа:
        System.out.println("Выполнение пункта 3.");
        integerEqual();
        System.out.println("END of paragraph 3.");
        System.out.println();

        // Выводим метод четвертого параграфа:
        System.out.println("Выполнение пункта 4.");
        plusOneMore();
        System.out.println("END of paragraph 4.");
        System.out.println();

        // Выводим метод пятого параграфа:
        System.out.println("Выполнение пункта 5.");
        halfMore();
        System.out.println("END of paragraph 5.");
        System.out.println();

        // Выводим сообщение о завершении выполнения ДЗ № 2.
        System.out.println("Домашнее задание № 2 закончено.");
        System.out.println();
    }
}