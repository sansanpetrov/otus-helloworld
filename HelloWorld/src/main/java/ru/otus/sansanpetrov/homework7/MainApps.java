package ru.otus.sansanpetrov.homework7;

public class MainApps {
    public static void main(String[] args) {
        // Создаем объекты
        Man man = new Man("Вася", "Вездеход");
        Bicycle bicycle = new Bicycle(88);
        Horse horse = new Horse(56, 56);
        Car car = new Car(40, 10);
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle(50, 70);

        // Выполняем методы

        man.changeKindOfMoving();

        if (man.getCurrentTransport() == "Пешком") {
            System.out.println(man.getName() + "успешно прошел нужное расстояние");
        }
        if (man.getCurrentTransport() == "Велосипед") {
            bicycle.moving(bicycle.getDistance(), Terrain.PLAIN);
        }
        if (man.getCurrentTransport() == "Лошадь") {
            horse.moving(horse.getForce(), horse.getDistance(), Terrain.SWAMP);
        }
        if (man.getCurrentTransport() == "Машина") {
            car.moving(car.getFuel(), car.getDistance(), Terrain.DEEPFOREST);
        }
        if (man.getCurrentTransport() == "Вездеход") {
            allTerrainVehicle.moving(allTerrainVehicle.getFuel(), allTerrainVehicle.getDistance(), Terrain.SWAMP);
        }
    }
}
