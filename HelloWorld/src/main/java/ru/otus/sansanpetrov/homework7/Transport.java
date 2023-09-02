package ru.otus.sansanpetrov.homework7;

public class Transport implements Travel {
    // Поля
    private int fuel;
    private int distance;
    private Terrain territory;

    // Конструктор
    public Transport(int fuel, int distance, Terrain territory) {
        this.fuel = fuel;
        this.distance = distance;
        this.territory = territory;
    }

    // getters
    public int getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }

    public Terrain getTerritory() {
        return territory;
    }

    // Методы
    @Override
    public boolean moving(int fuel, int distance) {
        return false;
    }

    @Override
    public boolean terr(Terrain territory) {
        return false;
    }
}
