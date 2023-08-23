package ru.otus.sansanpetrov.homework6;

public class Plate {
    // Поля
    private int foodVolumeMax; // Максимальная вместимость тарелки едой
    private int foodVolumeCurrent; // Текущая наполненность тарелки едой


    // Конструктор
    public Plate(int foodVolumeMax, int foodVolumeCurrent) {
        this.foodVolumeMax = foodVolumeMax;
        this.foodVolumeCurrent = foodVolumeCurrent;
    }

    // getters / setters

    public int getFoodVolumeMax() {
        return foodVolumeMax;
    }

    public int getFoodVolumeCurrent() {
        return foodVolumeCurrent;
    }

    // Когда кот ест и уменьшает количество еды, метод решает, хватило ли ему еды в тарелке.
    public boolean decreaseFood(int amount) {
        foodVolumeCurrent -= amount;
        if (foodVolumeCurrent < 0) {
            this.foodVolumeCurrent = 0;  // Эта строка нужна для применения метода добавки еды в тарелку
            return false;
        } else {
            return true;
        }
    }

    // Увеличиваем количество еды в тарелке
    public void increaseFood(int amount) {
        foodVolumeCurrent += amount;
        if (foodVolumeCurrent >= foodVolumeMax) {
            this.foodVolumeMax = 100;
        }
    }
}
