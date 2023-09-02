package ru.otus.sansanpetrov.homework7;

public class Car extends Transport {
    public Car(int fuel, int distance, Terrain territory) {
        super(fuel, distance, territory);
    }

    // Методы
    @Override
    public boolean moving(int fuel, int distance) {
        if (fuel < distance) {
            System.out.println("Топлива на дистанцию нет");
            return false;
        } else {
            System.out.println("Топлива на дистанцию хватило");
            return true;
        }
    }

    @Override
    public boolean terr(Terrain territory) {
        if (territory == Terrain.DEEPFOREST || territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
            return false;
        }
        System.out.println("Можно проехать");
        return true;
    }
}
