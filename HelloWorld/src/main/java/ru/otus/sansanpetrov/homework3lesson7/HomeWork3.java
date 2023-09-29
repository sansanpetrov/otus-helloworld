package ru.otus.sansanpetrov.homework3lesson7;

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
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= (size - 1); j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    //Метод, реализующий третий параграф задания
    public static void zeroDiag(int[][] zero) {
        //     int[][] zero = new int[3][3];  - Не понимаю, как давать массивы на вход метода.
        //     Работает только через new int[][]
        for (int i = 0; i < zero.length; i++) {
            for (int j = 0; j < zero[i].length; j++) {
                if (i == j) {
                    zero[i][j] = 0;
                }
                System.out.print(zero[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Метод, реализующий четвертый параграф задания
    public static void findMax(int[][] big) {
        //      int[][] big = new int[6][6];
        int a = 0;
        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < big[i].length; j++) {
                //              big[i][j] = (int) (Math.random() * 100); - Жалко удалять!
                //              System.out.print(big[i][j] + " ");  - Жалко удалять!
                if (big[i][j] >= a) {
                    a = big[i][j];
                }
            }
            //           System.out.println();  - Жалко удалять!
        }
        System.out.println("Наибольшее число:" + a);
        System.out.println();
    }

    //Метод, реализующий пятый параграф задания
    public static void sumSecondString(int[][] sSS) {
        int a = 0;
        if (sSS.length >= 2) {
            for (int j = 0; j < sSS[1].length; j++) {
                a += sSS[1][j];
            }
        } else {
            a = -1;
        }
        System.out.println("Сумма элементов второй строки массива:" + a);
        System.out.println();
    }


    public static void main(String[] args) {
        // Выводим результаты первого пункта задания
        System.out.println("Первый пункт третьего задания:");
        sumOfPositiveElements(new int[][]{{0, 2, 55, 26}, {5, 0, 0, 37}});
        System.out.println("Конец выполнения первого пункта.");
        System.out.println();

        // Выводим результаты второго пункта задания:
        System.out.println("Второй пункт третьего задания:");
        squareStar(6);
        System.out.println("Конец выполнения второго пункта.");
        System.out.println();

        // Выводим результаты третьего пункта задания:
        System.out.println("Третий пункт третьего задания:");
        zeroDiag(new int[][]{{25, 25, 25}, {25, 25, 25}, {25, 25, 25}});
        System.out.println("Конец выполнения третьего пункта.");
        System.out.println();

        // Выводим результаты четвертого пункта задания:
        System.out.println("Четвертый пункт третьего задания:");
        findMax(new int[][]{{26, 67, 128, 327}, {129, 998, 786, 1029}, {3289, 8888, 765, 2}, {238, 877, 887, 876}});
        System.out.println("Конец выполнения четвертого пункта.");
        System.out.println();

        // Выводим результаты пятого пункта задания:
        System.out.println("Пятый пункт третьего задания:");
        sumSecondString(new int[][]{{26, 67, 128, 327}, {129, 998, 786, 1029}, {3289, 8888, 765, 2}, {238, 877, 887, 876}});
        sumSecondString(new int[][]{{129, 998, 786, 1029}, {}});
        sumSecondString(new int[][]{{129, 998, 786, 1029}});
        System.out.println("Конец выполнения пятого пункта.");
        System.out.println();

        System.out.println("Конец выполнения третьего домашнего задания.");
    }
}
