package ru.otus.sansanpetrov.homework6lesson12;

public class Cat {
    // Поля
    private String name;
    private int appetite;
    private boolean satiety;


    // Конструктор
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name; // Имя кота
        this.appetite = appetite;  // Аппетит кота
        this.satiety = satiety; // Сытость. Кот или голоден, или сыт. Голоден по умолчанию (false)
    }

    // getters / setters

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    // Методы класса
    public void eat(Plate plate) {  // Кот ест и уменьшает объем еды в тарелке
      if (!plate.decreaseFood(appetite)) {
          System.out.println("Коту " + name + " не хватило еды и он голоден");
      } else {
          this.satiety = true;
          System.out.println("Кот " + name + " сыт и доволен");
      }
    }
}
