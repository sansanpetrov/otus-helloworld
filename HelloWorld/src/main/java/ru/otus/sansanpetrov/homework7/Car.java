package ru.otus.sansanpetrov.homework7;

public class Car extends Transport {
    // Конструктор
    public Car(int fuel, int distance) {
        super(fuel, distance);
    }

    // Методы
    @Override
    public boolean moving(int fuel, int distance, Terrain territory) {
        if (territory == Terrain.DEEPFOREST | territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
        } else {
            if (fuel < distance) {
                System.out.println("Можно проехать");
                System.out.println("Топлива на дистанцию нет");
            } else {
                System.out.println("Можно проехать");
                System.out.println("Топлива на дистанцию хватило");
            }
        }
        return true;
    }
}
