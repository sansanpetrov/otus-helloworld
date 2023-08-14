package ru.otus.sansanpetrov.homework5;

public class Cat extends Animal {
    public Cat(String name, int velocitySwim, int velocityRun, int endurance, int multi) {
        super(name, 0, velocityRun, endurance, 1);
    }

    @Override
    public float swim(int distance) {
        System.out.println("Коты не плавают!");
        return 0;
    }
}
