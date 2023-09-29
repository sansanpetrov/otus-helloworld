package ru.otus.sansanpetrov.homework9lesson15;

import java.util.*;

public class Main {

    // Пункт 1
    // Строим ArrayList в указанном диапазоне
    public static List<Integer> minMax(int min, int max) {
        List<Integer> arrayMinMax = new ArrayList<>();
        for (int i = 0; i < (max - min + 1); i++) {
            arrayMinMax.add(i + min);
        }
        System.out.println(arrayMinMax);
        return arrayMinMax;
    }

    // Пункт 2
    // Возвращаем сумму всех элементов ArrayList, которые больше 5
    public static int moreThanFive(ArrayList<Integer> moreFive) {
        int sum = 0;
        for (int i = 0; i < moreFive.size(); i++) {
            if (moreFive.get(i) > 5) {
                sum += moreFive.get(i);
            }
        }
        System.out.println("Сумма элементов, больших 5: " + sum);
        return sum;
    }

    // Пункт 3
    // Переписываем ячейки ссылочного списка
    public static List<Integer> substArray(ArrayList<Integer> oneConstant, Integer b) {
        for (int i = 0; i < oneConstant.size(); i++) {
            oneConstant.set(i, b);
        }
        System.out.println(oneConstant);
        return oneConstant;
    }

    // Пункт 4
    // Увеличиваем значения ячеек ссылочного списка
    public static List<Integer> plusArray(ArrayList<Integer> plusConstant, Integer a) {
        for (int i = 0; i < plusConstant.size(); i++) {
            plusConstant.set(i, plusConstant.get(i) + a);
        }
        System.out.println(plusConstant);
        return plusConstant;
    }

    public static void main(String[] args) {
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
        substArray(new ArrayList<>(Arrays.asList(2, 5, 6, 7, 7, 3)), 25);
        System.out.println("Пункт № 3 выполнен");
        System.out.println();
        // Запускаем четвертый метод
        System.out.println("Пункт № 4");
        plusArray(new ArrayList<>(Arrays.asList(2, 5, 6, 7, 7, 3)), 30);
        System.out.println("Пункт № 4 выполнен");
        System.out.println();
        // Запускаем методы с классом Employee
        System.out.println("Пункт № 5. Операции с классом Employee");
        Employee.nameEmployee(new ArrayList<>(Arrays.asList(new Employee("Петров-Водкин", 35), new Employee("Коровин", 83), new Employee("Саврасов", 25), new Employee("Айвазовский", 70))));
        Employee.moreAgeEmployee(new ArrayList<>(Arrays.asList(new Employee("Петров-Водкин", 35), new Employee("Коровин", 83), new Employee("Саврасов", 25), new Employee("Айвазовский", 70))), 50);
        Employee.averageAgeEmployee(new ArrayList<>(Arrays.asList(new Employee("Петров-Водкин", 35), new Employee("Коровин", 83), new Employee("Саврасов", 25), new Employee("Айвазовский", 70))), 53);
        Employee.yangestEmployee(new ArrayList<>(Arrays.asList(new Employee("Петров-Водкин", 35), new Employee("Коровин", 83), new Employee("Саврасов", 25), new Employee("Айвазовский", 70))));
        System.out.println("Пункт № 5 выполнен");
        System.out.println();

    }
}
