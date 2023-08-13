package ru.otus.sansanpetrov.homework5;

public class Cat extends Animal {
    public Cat(String name, int velocitySwim, int velocityRun, int endurance) {
        super(name, velocitySwim, velocityRun, endurance);
    }

    @Override
    public void swim(int distance) {
        velocitySwim = 0;
        System.out.println("Коты не плавают!");
    }
}
