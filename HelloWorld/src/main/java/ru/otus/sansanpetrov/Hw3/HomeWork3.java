package ru.otus.sansanpetrov.hw3;

public class HomeWork3 {
    //Метод, реализующий первый параграф задания
    public static void sumOfPositiveElements(int[][] arrayDouble) {
        int sumOfPositive = 0;
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble[i].length; j++) {
                if (arrayDouble[i][j] > 0) {
                    sumOfPositive += arrayDouble[i][j];
                }
            }
        }
        System.out.print("Сумма элементов массива больше нуля:" + sumOfPositive);
        System.out.println();
    }
        //Метод, реализующий второй параграф задания
        public static void squareStar(int size) {
            char[][] squareStarrr = new char[size][size];
            for (int i = 0; i < squareStarrr.length; i++) {
                for (int j = 0; j < squareStarrr[i].length; j++) {
                    squareStarrr[i][j] = '*';
                }
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(squareStarrr[i][j] + " ");
                }
                System.out.println();
            }
        }

        //Метод, реализующий третий параграф задания


        //Метод, реализующий четвертый параграф задания


        //Метод, реализующий пятый параграф задания


    public static void main(String[] args) {
        // Выводим результаты первого пункта задания
        System.out.println("Первый пункт третьего задания:");
        sumOfPositiveElements(new int[][]{{0, 2, 55, 26}, {5, 0, 0, 37}});
        System.out.println("Конец выполнения первого пункта.");

        // Выводим результаты второго пункта задания:
        System.out.println("Второй пункт третьего задания:");
        squareStar(8);
        System.out.println("Конец выполнения второго пункта.");

        // Выводим результаты третьего пункта задания:
        System.out.println("Третий пункт третьего задания:");

        System.out.println("Конец выполнения третьего пункта.");

        // Выводим результаты четвертого пункта задания:
        System.out.println("Четвертый пункт третьего задания:");

        System.out.println("Конец выполнения четвертого пункта.");

        // Выводим результаты пятого пункта задания:
        System.out.println("Пятый пункт третьего задания:");

        System.out.println("Конец выполнения пятого пункта.");

        System.out.println("Конец выполнения третьего домашнего задания.");
    }
}
