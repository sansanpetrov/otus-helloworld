package ru.otus.sansanpetrov.hw3;

public class HomeWork3 {
    //Метод, реализующий первый параграф задания
    public static void sumOfPositiveElements(int[][] arrayDouble) {
 int sumOfPositive = 0;
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble[i].length; j++) {
                if(arrayDouble[i][j] > 0) {
                    sumOfPositive += arrayDouble[i][j];
                }
            }
        }
        System.out.print("Сумма элементов массива больше нуля:" + sumOfPositive);
        System.out.println();
 }
    public static void main(String[] args) {
        // Выводим результаты первого пункта задания
        System.out.println("Первый пункт третьего задания:");
        sumOfPositiveElements(new int [][] {{0, 2, 55, 26},{5, 0, 0, 37}});
        System.out.println("Конец выполнения первого пункта.");
    }
}
