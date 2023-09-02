package ru.otus.sansanpetrov.homework7;

public class MainApps {
    public static void main(String[] args) {
        // Создаем объекты
        Man man = new Man("Вася", "Машина");
        Bicicle bicicle = new Bicicle(88, Terrain.DEEPFOREST);
        Horse horse = new Horse(56, 56, Terrain.SWAMP);
        Car car = new Car(100, 40, Terrain.DEEPFOREST);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(70, 50, Terrain.SWAMP);

        // Пишем и выполняем методы

        man.change();
        if (man.getCurrentTransport() == "Пешком") {
            man.walk();
        }
        if (man.getCurrentTransport() == "Лошадь") {
            horse.terr(horse.getTerritory());
            horse.moving(horse.getForce(), horse.getDistance());
        }
        if (man.getCurrentTransport() == "Велосипед") {
            bicicle.terr(bicicle.getTerritory());
            bicicle.moving(bicicle.getDistance());
        }
        if (man.getCurrentTransport() == "Машина") {
            car.terr(car.getTerritory());
            car.moving(car.getFuel(), car.getDistance());
        }
        if (man.getCurrentTransport() == "Вездеход") {
            allTerrainVehicle.terr(allTerrainVehicle.getTerritory());
            allTerrainVehicle.moving(allTerrainVehicle.getFuel(), allTerrainVehicle.getDistance());
        }
    }
}
