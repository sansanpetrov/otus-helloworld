package ru.otus.sansanpetrov.homework2;

import java.util.Scanner;
import java.util.Arrays;

// Создаем класс с Домашним заданием № 2
public class Hw2Massive {

    public static void printString(int numberOfString, String ofString) {
        // Выполняем пункт № 1.
        for (int i = 0; i < numberOfString; i++) {
            System.out.println(ofString);
        }
    }

    public static void sumArrayMore5(int[] vector) {
        // Выполняем пункт № 2.
        // Заполняем значения массива случайными числами и вычисляем сумму элементов,
        // значение которых больше 5-ти
        int sum = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 5) {
                sum += vector[i];
            }
        }
        System.out.println("Созданный массив: " + Arrays.toString(vector));
        System.out.println("Сумма элементов массива, значене которых больше 5: " + sum);
    }

    // Выполняем пункт № 3
    public static void integerEqual(int integer, int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = integer;
        }
        System.out.println("Значения массива mass: " + Arrays.toString(mass));
    }

    // Выполняем пункт № 4
    public static void plusOneMore(int oneMorePlus, int[] plus) {
        for (int i = 0; i < plus.length; i++) {
            //        plus[i] = plus[i] + oneMorePlus;
            plus[i] += oneMorePlus;
        }
        System.out.println("Значения массива plus: " + Arrays.toString(plus));
    }

    // Выполняем пункт № 5
    public static void halfMore(int[] half) {
        int sum1 = 0, sum2 = 0; //Определяем начальные значения сумм половин элементов
        for (int i = 0; i < half.length; i++) {
            half[i] = (int) (Math.random() * 90);
            if (i <= half.length / 2) {
                sum1 += half[i]; //Сумма первой половины элементов
            }
            if (i > half.length / 2 && i <= half.length) {
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
        printString(25, "Печать строки");
        System.out.println("END of paragraph 1.");
        System.out.println();

        // Выводим метод второго параграфа
        System.out.println("Выполнение пункта 2.");
        sumArrayMore5(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("END of paragraph 2.");
        System.out.println();

        // Выводим метод третьего параграфа:
        System.out.println("Выполнение пункта 3.");
        integerEqual(33, new int[]{3, 2, 1, 77, 45, 25, 10, 15, 234, 0});
        System.out.println("END of paragraph 3.");
        System.out.println();

        // Выводим метод четвертого параграфа:
        System.out.println("Выполнение пункта 4.");
        plusOneMore(45, new int[]{3, 2, 1, 77, 45, 25, 10, 15, 234, 0});
        System.out.println("END of paragraph 4.");
        System.out.println();

        // Выводим метод пятого параграфа:
        System.out.println("Выполнение пункта 5.");
        halfMore(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println("END of paragraph 5.");
        System.out.println();

        // Выводим сообщение о завершении выполнения ДЗ № 2.
        System.out.println("Домашнее задание № 2 закончено.");
        System.out.println();
    }
}