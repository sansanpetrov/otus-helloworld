package ru.otus.sansanpetrov.homework7lesson13;

public class Bicycle implements Travel {
    private int distance;

    //Конструктор
    public Bicycle(int distance) {
        this.distance = distance;
    }

    // getters
    public int getDistance() {
        return distance;
    }

    // Методы
    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Болото. Проехать нельзя");
        }
            System.out.println("Можно проехать");
        return true;
    }
}
