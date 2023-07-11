package ru.otus.sansanpetrov;

// Создаем класс helloworld
public class helloworld {

    //Выполнение параграфа 1
    public static void greeting() { //Создаем метод greeting- вывод приветствия
        System.out.println("Paragraph 1\n");
        System.out.println("Hello\nWorld\nfrom\nJava\n"); // Выводим приветствие в консоль
        System.out.println("END of paragraph 1\n");
    }
// Выполнение параграфа 2
    public static void checkSign(int a, int b, int c) { //Создаем метод checkSum- сравнение суммы с нулем
        System.out.println("Paragraph 2\n");

        int sum = a + b + c;   // Вычисляем сумму

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
        int data = 21;
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
        // Объявляем переменные
        int a= 23235;
        int b= 10256;

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




        System.out.println("END of paragraph 5\n");
    }

// Выполнение всех задач
    public static void main(String args[]) { // Создаем метод main (основной метод, тело программы)
        greeting();
        checkSign(3, 5, -10);
selectColor();
compareNumbers();
    }
}
