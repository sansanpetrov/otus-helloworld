package ru.otus.sansanpetrov.homework5;

public class Animal {
    // Поля
    String name; // Имя животного
    int velocitySwim; // Скорость плавания в м/с
    int velocityRun; // Скорость бега в м/с
    int endurance; // Выносливость

    // Конструктор
    public Animal(String name, int velocitySwim, int velocityRun, int endurance) {
        this.name = name;
        this.velocitySwim = velocitySwim;
        this.velocityRun = velocityRun;
        this.endurance = endurance;
    }

    // getters / setters
    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Имя не меняется!");
    }

    public int getVelocitySwim() {
        return velocitySwim;
    }

    public void setVelocitySwim() {
        System.out.println("Скорость плавания не меняется!");
    }

    public int getVelocityRun() {
        return velocityRun;
    }

    public void setVelocityRun() {
        System.out.println("Скорость бега не меняется!");
    }

    public int getEndurance() {
        return endurance;
    }

// Методы животного

    public void run(int distance) {
        int timeRun;
        if (endurance < 0) {
            endurance = -1;
        } else {
            timeRun = distance / velocityRun;
            System.out.println("Время, затраченное на преодоление дистанции бегом: " + timeRun + " секунд.");
            endurance = endurance - distance;
        }
    }

    public void swim(int distance) {
        int timeSwim;
        if (endurance < 0) {
            endurance = -1;
        } else {
            timeSwim = distance / velocitySwim;
            System.out.println("Время, затраченное на преодоление дистанции вплавь: " + timeSwim + " секунд.");
            endurance = endurance - distance;
        }
    }

    public void info() {
        if (endurance != -1) {
            System.out.println("Текущее состояние " + name + " в единицах выносливости: " + endurance);
        } else {
            System.out.println("У " + name + " появилось состояние усталости");
        }
    }
}
