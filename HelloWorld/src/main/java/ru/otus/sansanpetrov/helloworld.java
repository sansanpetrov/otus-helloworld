package ru.otus.sansanpetrov;

import java.util.Scanner;

// Создаем класс HelloWorld
public class HelloWorld {

    //Выполнение параграфа 1
    public static void greeting() { //Создаем метод greeting- вывод приветствия
        System.out.println("Paragraph 1\n");
        System.out.println("Hello\nWorld\nfrom\nJava\n"); // Выводим приветствие в консоль
        System.out.println("END of paragraph 1\n");
    }

    // Выполнение параграфа 2
    public static void checkSign() { //Создаем метод checkSum- сравнение суммы с нулем
        System.out.println("Paragraph 2\n");

        // Числа изменяются случайным образом
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * (-20));
        int c = (int) (Math.random() * 10);
        // Печатаем значения a, b и c
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        int sum = a + b + c;   // Вычисляем сумму
        System.out.println("Sum=" + sum);    //Вывод значения
        //Далее сравниваем сумму с нулем и выводим результат сообщением в консоль
        if (sum >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
            System.out.println("END of paragraph 2\n");
        }

    }

    //Выполнение параграфа 3
    public static void selectColor() {
        System.out.println("Paragraph 3\n");

        int data = (int) (Math.random() * 40); //Переменная меняется случайным образом
        System.out.println("data=" + data);     // Вывод значения
        if (data <= 10) {                    // Сравниваем с 10 и выводим "Красный"
            System.out.println("Красный\n");
        }
        if (data > 10 && data <= 20) {              // Убеждаемся, что значение между 10 и 20
            System.out.println("Желтый\n");       //Выводим "Желтый"
        }
        if (data > 20) {
            System.out.println("Зеленый\n");  // Выводим "Зеленый", если значение больше 20
        }
        System.out.println("END of paragraph 3\n");
    }

    // Выполнение параграфа 4

    public static void compareNumbers() {
        System.out.println("Paragraph 4\n");
        // Объявляем переменные, значение определяем с помощью генератора
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 1000);

        // Выводим значения
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        if (a >= b) {     // Сравниваем значения
            System.out.println("a>=b\n");
        } else {
            System.out.println("a<b\n");
        }
        System.out.println("END of paragraph 4\n");
    }

    // Выполнение параграфа 5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        System.out.println("Paragraph 5\n");

        // Печатаем значение increment и переменных

        System.out.println("Increment = " + increment);
        System.out.println("initValue = " + initValue);
        System.out.println("delta = " + delta);

        // Определяем действия

        if (increment) {
            System.out.println("Сумма переменных = " + (initValue + delta));
        } else {
            System.out.println("Разность переменных = " + (initValue - delta));
        }

        System.out.println("END of paragraph 5\n");
    }

    // Выполнение всех задач  в зависимости от выбора пользователя
    public static void main(String args[]) { // Создаем метод main (основной метод, тело программы)

        // Выводим приглашение и ждем ввода цифры
        //  Вводим инструкции ожидания ввода пользователя.

        System.out.println("Пожалуйста введите целое число от 1 до 5 и нажмите Enter:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        // Запускаем выбранный метод (программу)

        if (no == 1) {
            greeting();
        }
        if (no == 2) {
            checkSign();
        }
        if (no == 3) {
            selectColor();
        }
        if (no == 4) {
            compareNumbers();
        }
        if (no == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 1000), (int) (Math.random() * 1000), ((int) (Math.random() * 1000)) >= (int) (Math.random() * 1000));
        }
    }
}

