package ru.otus.sansanpetrov.homework7;

public class Man {
    // Поля
    private String name;
    private String currentTransport;

    // Конструктор

    public Man (String name, String currentTransport) {
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

}
