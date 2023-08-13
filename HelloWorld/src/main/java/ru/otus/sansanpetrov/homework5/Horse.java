package ru.otus.sansanpetrov.homework5;

public class Horse extends Animal {
    public Horse(String name, int velocitySwim, int velocityRun, int endurance) {
        super(name, velocitySwim, velocityRun, endurance);
    }

    @Override
    public void swim(int distance) {
        int timeSwim;
        if (endurance < 0) {
            endurance = -1;
        } else {
            timeSwim = distance / velocitySwim;
            System.out.println("Время, затраченное на преодоление дистанции вплавь: " + timeSwim + " секунд.");
            endurance = endurance - distance * 4;
        }
    }
}
