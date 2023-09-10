package ru.otus.sansanpetrov.homework7;

public class Man {
    // Поля
    private String name;
    private String currentTransport;

    // Конструктор
    public Man(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    // getters / setters

    public String getName() {
        return name;
    }

    public String getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport() {
        this.currentTransport = currentTransport;
    }

    // Методы
    // Человек выбирает виды транспорта
    public void changeKindOfMoving() {
        if (currentTransport == "Пешком") {
            System.out.println(name + " идет пешком");
        }
        if (currentTransport == "Велосипед") {
            System.out.println(name + " едет на велосипеде");
        }
        if (currentTransport == "Лошадь") {
            System.out.println(name + " едет на лошади");
        }
        if (currentTransport == "Машина") {
            System.out.println(name + " едет на машине");
        }
        if (currentTransport == "Вездеход") {
            System.out.println(name + " едет на вездеходе");
        }
    }
}
