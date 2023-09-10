package ru.otus.sansanpetrov.homework7;

public class Transport implements Travel {
    // Поля
    private int distance;
    private int fuel;

    // Конструктор
    public Transport(int distance, int fuel) {
        this.fuel = fuel;
        this.distance = distance;
    }

    // getters
    public int getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }

    // Методы
    @Override
    public boolean moving(int distance, int fuel, Terrain territory) {
        return false;
    }
}
