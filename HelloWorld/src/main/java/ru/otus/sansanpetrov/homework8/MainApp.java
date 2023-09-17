package ru.otus.sansanpetrov.homework8;

public class MainApp {

    // Метод, принимающий массив 4х4. Выполняем пункт № 1
    public static void massive4Size(String[][] sentences) {
        int sum = 0;
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length; j++) {
                if (sentences.length != 4 || sentences[i].length != 4) {
                    System.out.println("Длина текущего массива " + sentences.length);
                    throw new AppArraySizeException("Длина массива не равна 4!\n");
                }
            }
        }
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length; j++) {
                try {
                    Integer.parseInt(sentences[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ячейка (" + i + "," + j + ") содержит слово");
                }
                sum += Integer.parseInt(sentences[i][j]);
            }
        }
        System.out.println("Сумма всех преобразованных элементов массива= " + sum);
    }

    public static void main(String[] args) {
        try {
            //     massive4Size(new String[][]{{"1", "2", "3", "4", "9"}, {"5", "6", "7", "8", "10"}});
            massive4Size(new String[][]{{"1", "2", "3", "4", "20"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}});
            //       massive4Size(new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}});
            //      massive4Size(new String[][]{{"1", "Cat", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}});
        } catch (AppArraySizeException e) {
            e.printStackTrace();
        } catch (AppArrayDataException e) {
            e.printStackTrace();
        }
    }
}
