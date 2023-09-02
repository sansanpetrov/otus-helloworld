package ru.otus.sansanpetrov.homework7;

public class Horse implements Travel {
    private int force;
    private int distance;
    private Terrain territory;

    // Конструктор
    public Horse(int force, int distance, Terrain territory) {
        this.force = force;
        this.distance = distance;
        this.territory = territory;
    }

    // getters
    public int getForce() {
        return force;
    }

    public int getDistance() {
        return distance;
    }

    public Terrain getTerritory() {
        return territory;
    }

    // Методы
    @Override
    public boolean moving(int force, int distance) {
        if (force < distance) {
            System.out.println("Сил на дистанцию нет");
            return false;
        } else {
            System.out.println("Сил на дистанцию хватило");
            return true;
        }
    }

    @Override
    public boolean terr(Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
            return false;
        }
        System.out.println("Можно проехать");
        return true;
    }
}
