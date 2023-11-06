package ru.otus.sansanpetrov.homework14lesson21.math;

import java.util.Arrays;

public class Calculation {
    private int numberOfElements;

    public Calculation(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public static double[] fillMassive(int numberOfElements) {
        double[] array = new double[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(Arrays.toString(fillMassive(1_000_000)));
        System.out.println("Задача выполнена за " + (System.currentTimeMillis() - time) + " миллисекунд");
    }
}
