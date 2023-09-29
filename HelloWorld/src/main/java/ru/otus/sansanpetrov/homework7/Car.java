package ru.otus.sansanpetrov.homework7;

public class Car implements Travel {
    private int fuel;
    private int distance;

    // Конструктор
    public Car(int fuel, int distance) {
        this.fuel = fuel;
        this.distance = distance;
    }

    //getters
    public int getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }

    // Методы
    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.DEEPFOREST | territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
        }
        if (fuel < distance) {
            System.out.println("Можно проехать");
            System.out.println("Топлива на дистанцию нет");
        } else {
            System.out.println("Можно проехать");
            System.out.println("Топлива на дистанцию хватило");
        }
        return true;
    }
}
