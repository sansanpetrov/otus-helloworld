package ru.otus.sansanpetrov.homework14lesson21.realization1;

import ru.otus.sansanpetrov.homework14lesson21.math.Calculation;

import java.util.Arrays;

public class Realization1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        System.out.println(Arrays.toString(Calculation.fillMassive(1_000_000)));
        Calculation.fillMassive(1_000_000);
        System.out.println("Задача выполнена за " + (System.currentTimeMillis() - time) + " миллисекунд");
    }
}
