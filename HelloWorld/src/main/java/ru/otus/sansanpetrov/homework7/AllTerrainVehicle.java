package ru.otus.sansanpetrov.homework7;

public class AllTerrainVehicle extends Transport {
    public AllTerrainVehicle(int fuel, int distance) {
        super(fuel, distance);
    }

    // Методы
    @Override
    public boolean moving(int fuel, int distance, Terrain territory) {
        if (fuel < distance) {
            System.out.println("Топлива на дистанцию нет");
        }
        System.out.println("Топлива на дистанцию хватило");
        System.out.println("Везде проехал");
        return true;
    }
}
