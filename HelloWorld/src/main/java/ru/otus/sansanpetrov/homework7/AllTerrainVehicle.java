package ru.otus.sansanpetrov.homework7;

public class AllTerrainVehicle extends Transport {
    public AllTerrainVehicle(int fuel, int distance, Terrain territory) {
        super(fuel, distance, territory);
    }

    // Методы
    @Override
    public boolean moving(int fuel, int distance) {
        if (fuel < distance) {
            System.out.println("Топлива на дистанцию нет");
            return false;
        } else {
            System.out.println("Топлива на дистанцию хватило");
            return true;
        }
    }

    @Override
    public boolean terr(Terrain territory) {
        System.out.println("Можно проехать");
        return true;
    }
}
