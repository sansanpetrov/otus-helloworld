package ru.otus.sansanpetrov.homework7;

public class Bicycle {
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
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
        } else {
            System.out.println("Можно проехать");
        }
        return true;
    }
}
