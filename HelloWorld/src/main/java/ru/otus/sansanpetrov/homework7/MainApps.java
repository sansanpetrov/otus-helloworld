package ru.otus.sansanpetrov.homework7;

public class MainApps {
    public static void main(String[] args) {
        // Создаем объекты
        Travel device;  // Далее присваиваем вид транспорта
        Travel car = new Car(100, 120);
        Travel bicycle = new Bicycle(200);
        Travel horse = new Horse(150, 30);
        Travel allTerrainVehicle = new AllTerrainVehicle(150, 120);
//        device = null; // Идем пешком
//        device = car; // Едем на машине
//        device = bicycle; // Едем на веосипеде
        device = horse; // Едем на лошади
//        device = allTerrainVehicle; // Едем на вездеходе
        Man human = new Man("Вася", device);


        // Движемся
        human.kindOfTransport(device);
        human.travellingMan(120, Terrain.DEEPFOREST);
        System.out.println();
    }
}

