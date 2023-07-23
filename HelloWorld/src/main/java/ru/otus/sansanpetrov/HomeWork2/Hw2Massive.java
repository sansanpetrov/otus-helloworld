package ru.otus.sansanpetrov.HomeWork2;

import java.util.Scanner;
import java.util.Arrays;

// Создаем класс с Домашним заданием № 2
public class Hw2Massive {

        public static void printString() {
                // Выполняем пункт № 1. Применяем генератор случайных чисел.
                // В качестве множителя принимаем ввод числа от пользователя.
                int input = 0;
                System.out.println("Пожалуйста введите целое число и нажмите Enter:");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                int j = (int) (Math.random() * input);
                int []  array =new int [j];
                for (int i = 0; i < j; i++) {
                       System.out.println(Arrays.toString(array));
                }

        }

        // Запускаем основную программу со всеми методами по очереди:
        public static void main(String args[]) {
// Выводим метод HwMassive
                printString();
        }
}