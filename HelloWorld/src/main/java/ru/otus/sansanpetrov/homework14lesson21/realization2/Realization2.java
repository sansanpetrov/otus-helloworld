package ru.otus.sansanpetrov.homework14lesson21.realization2;

import ru.otus.sansanpetrov.homework14lesson21.math.Calculation2;

import java.util.Arrays;

public class Realization2 {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
//        System.out.println(Arrays.toString(Calculation2.fillMassive2(9)));
        Calculation2.fillMassive2(100_000_000);
        System.out.println("Задача выполнена за " + (System.currentTimeMillis() - time) + " миллисекунд");
    }
}
