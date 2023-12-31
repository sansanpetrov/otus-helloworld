package ru.otus.sansanpetrov.homework5lesson11;

public class Animal {
    // Поля
    String name; // Имя животного
    int velocityRun; // Скорость бега в м/с
    int endurance; // Выносливость
    int velocitySwim; // Скорость плавания в м/с
    int multiplierSwim; // Множитель выносливости для плавания

    // Конструктор
    public Animal(String name, int velocityRun, int velocitySwim, int endurance, int multiplierSwim) {
        this.name = name;
        this.velocityRun = velocityRun;
        this.endurance = endurance;
        this.velocitySwim = velocitySwim;
        this.multiplierSwim = multiplierSwim;
    }

    // getters / setters
    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Имя не меняется!");
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

    public int getVelocitySwim() {
        return velocitySwim;
    }

    public void setVelocitySwim(int velocitySwim) {
        System.out.println("Скорость плавания не меняется!");
    }
    public int getMultiplierSwim() {
        return multiplierSwim;
    }
    public void setMultiplierSwim(int multiplierSwim) {
        System.out.println("Множитель усилий для плавания изменить нельзя!!");
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
        endurance -= distance * multiplierSwim;
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
