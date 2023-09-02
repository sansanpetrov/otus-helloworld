package ru.otus.sansanpetrov.homework7;

public class Bicicle {
    private int distance;
    private Terrain territory;

    //Конструктор
    public Bicicle(int distance, Terrain territory) {
        this.distance = distance;
        this.territory = territory;
    }

    // getters
    public int getDistance() {
        return distance;
    }

    public Terrain getTerritory() {
        return territory;
    }

    // Методы
    public boolean moving(int distance) {
        return true;
    }

    public boolean terr(Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
            return false;
        }
        System.out.println("Можно проехать");
        return true;
    }
}
