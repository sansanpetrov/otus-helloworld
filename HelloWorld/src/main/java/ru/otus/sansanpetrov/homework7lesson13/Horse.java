package ru.otus.sansanpetrov.homework7lesson13;

public class Horse implements Travel {
    private int force;
    private int distance;

    // Конструктор
    public Horse(int force, int distance) {
        this.force = force;
        this.distance = distance;
    }

    // getters
    public int getForce() {
        return force;
    }

    public int getDistance() {
        return distance;
    }

    // Методы
    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println(territory + "Проехать нельзя");
        }
            if (force < distance) {
                System.out.println("Можно проехать");
                System.out.println("Сил на дистанцию нет");
            } else {
                System.out.println("Можно проехать");
                System.out.println("Сил на дистанцию хватило");
            }
        return true;
    }
}
