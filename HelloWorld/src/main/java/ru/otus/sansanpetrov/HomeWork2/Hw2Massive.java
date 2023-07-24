package ru.otus.sansanpetrov.HomeWork2;

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

    // Запускаем основную программу со всеми методами по очереди:
    public static void main(String args[]) {

// Выводим метод первого параграфа
        printString();

        // Выводим метод второго параграфа
        sumArrayMore5();
    }
}