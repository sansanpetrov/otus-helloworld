package ru.otus.sansanpetrov.homework7;

public class AllTerrainVehicle implements Travel {
    private int fuel;
    private int distance;

    public AllTerrainVehicle(int fuel, int distance) {
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
    public boolean moving(int distance, Terrain territory) {
        if (fuel < distance) {
            System.out.println("Топлива на дистанцию нет");
        }
        System.out.println("Топлива на дистанцию хватило");
        System.out.println("Везде проехал");
        return true;
    }
}
