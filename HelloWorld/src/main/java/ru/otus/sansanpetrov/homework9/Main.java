package ru.otus.sansanpetrov.homework9;

import java.util.*;

public class Main {

    // Пункт 1
    // Строим ArrayList в указанном диапазоне
    public static void  minMax(int min, int max) {
        List<Integer> arrayMinMax = new ArrayList<>();
        for (int i = 0; i < (max - min + 1); i++) {
            arrayMinMax.add(i + min);
        }
        System.out.println(arrayMinMax);
    }

    // Пункт 2
    // Возвращаем сумму всех элементов ArrayList, которые больше 5
    public static void moreThanFive(ArrayList<Integer> moreFive) {
        int sum = 0;
        for (int i = 0; i < moreFive.size(); i++) {
            if (moreFive.get(i) > 5) {
                sum += moreFive.get(i);
            }
        }
        System.out.println("Сумма элементов, больших 5: " + sum);
    }
    // Пункт 3
    // Переписываем ячейки ссылочного списка
    public static void substArray(LinkedList<Integer> oneConstant, Integer b) {
        for (int i = 0; i < oneConstant.size(); i++) {
            oneConstant.set(i, b);
        }
        System.out.println(oneConstant);
    }
    // Пункт 4
    // Увеличиваем значения ячеек ссылочного списка
    public static void plusArray(LinkedList<Integer> plusConstant, Integer a) {
        for (int i = 0; i < plusConstant.size(); i++) {
            plusConstant.set(i, plusConstant.get(i) + a);
        }
        System.out.println(plusConstant);
    }

        public static void main (String[] args) {
            // Запускаем первый метод
            System.out.println("Пункт № 1");
            minMax(24, 50);
            System.out.println("Пункт № 1 выполнен");
            System.out.println();
            // Запускаем второй метод
            System.out.println("Пункт № 2");
           moreThanFive(new ArrayList<>(Arrays.asList(2, 5, 6, 7, 7, 3)));
            System.out.println("Пункт № 2 выполнен");
            System.out.println();
            // Запускаем третий метод
            System.out.println("Пункт № 3");
            substArray(new LinkedList<>(Arrays.asList(2, 5, 6, 7, 7, 3)), 25);
            System.out.println("Пункт № 3 выполнен");
            System.out.println();
            // Запускаем четвертый метод
            System.out.println("Пункт № 4");
            plusArray(new LinkedList<>(Arrays.asList(2, 5, 6, 7, 7, 3)), 30);
            System.out.println("Пункт № 4 выполнен");
            System.out.println();
        }
    }
