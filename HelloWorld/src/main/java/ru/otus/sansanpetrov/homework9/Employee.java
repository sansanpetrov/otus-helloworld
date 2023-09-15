package ru.otus.sansanpetrov.homework9;

import java.util.ArrayList;

public class Employee {
    // Поля
//    private String name;
    private String name;
    private Integer age;

    // Конструктор
    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Возвращаем список имен сотрудников
    public static void nameEmployee(ArrayList<Employee> company) {
        System.out.println(company);
        System.out.println("Имена сотрудников:");
        for (Employee n : company) {
            System.out.println(n.getName());
        }
        System.out.println();
    }

    // Возвращаем список сотрудников, возраст которых больше или равен указанному значению
    public static void moreAgeEmployee(ArrayList<Employee> company, Integer a) {
        System.out.println("Имя сотрудника" + "     " + "Возраст");
        for (Employee n : company) {
            if (n.getAge() >= a) {
                System.out.println(n.getName() + "         " + n.getAge());
            }
        }
        System.out.println();
    }

    // Сравниваем результат вычисления среднего возраста с минимальным значением
    public static void averageAgeEmployee(ArrayList<Employee> company, Integer a) {
        Integer averageTemp = 0;
        for (Employee n : company)
            averageTemp += n.getAge();
        if (averageTemp / company.size() >= a) {
            System.out.println("Средний возраст превышает указанный предел");
        } else {
            System.out.println("Средний возраст не превышает указанный предел");
        }
        System.out.println();
    }

    // Возвращаем ссылку на самого молодого сотрудника
    public static void yangestEmployee(ArrayList<Employee> company) {
        Integer maxYear = 150;
        String yangName = null;
        for (Employee n : company) {
            for (int i = 0; i < company.size(); i++) {
                if (n.getAge() <= maxYear) {
                    yangName = n.getName();
                    maxYear = n.getAge();
                }
            }
        }
        System.out.println("Имя и возраст самого молодого сотрудника:" + yangName + " " + maxYear);
    }
}
