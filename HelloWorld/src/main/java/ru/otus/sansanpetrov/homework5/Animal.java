package ru.otus.sansanpetrov.homework5;

public class Animal {
    // Поля
    String name; // Имя животного
    int velocitySwim; // Скорость плавания в м/с
    int velocityRun; // Скорость бега в м/с
    int endurance; // Выносливость
    int multi; // Множитель выносливости для плавания

    // Конструктор
    public Animal(String name, int velocitySwim, int velocityRun, int endurance, int multi) {
        this.name = name;
        this.velocitySwim = velocitySwim;
        this.velocityRun = velocityRun;
        this.endurance = endurance;
        this.multi = multi;
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

    public float run(int distance) {
        if (endurance == -1) {
            System.out.println("Нет сил бежать!");
            return endurance;
        }
        float timeRun = distance / velocityRun;
            System.out.println("Время, затраченное на преодоление дистанции бегом: " + timeRun + " секунд.");
        endurance -= distance;
        if (endurance <= 0) {
            endurance = -1;
            System.out.println("Силы животного иссякли.");
        }
        return endurance;
    }

    public float swim(int distance) {
        if (endurance == -1) {
            System.out.println("Нет сил плыть!");
            return endurance;
        }
        float timeSwim = distance / velocitySwim;
        System.out.println("Время, затраченное на преодоление дистанции вплавь: " + timeSwim + " секунд.");
        endurance -= distance * multi;
        if (endurance <= 0) {
            endurance = -1;
            System.out.println("Силы животного иссякли.");
        }
        return endurance;
    }

    public void info() {
        if (endurance != -1) {
            System.out.println("Текущее состояние " + name + " в единицах выносливости: " + endurance);
        } else {
            System.out.println("У " + name + " появилось состояние усталости");
        }
    }
}
