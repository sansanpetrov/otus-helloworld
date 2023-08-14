package ru.otus.sansanpetrov.homework5;

public class MainApps {
    public static void main(String[] args) {
        Cat cat = new Cat("Дымок", 0, 2, 100, 1);
        cat.info();
        cat.run(20);
        cat.swim(20);
        cat.info();
        System.out.println();

        Dog dog = new Dog("Жучка", 1, 5, 200, 2);
        dog.info();
        dog.run(100);
        dog.swim(50);
        dog.info();
        System.out.println();

        Horse horse = new Horse("Нектар", 5, 40, 400, 4);
        horse.info();
        horse.run(2000);
        horse.swim(500);
        horse.info();
        System.out.println();
    }
}
