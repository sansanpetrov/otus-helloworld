package ru.otus.sansanpetrov.homework4;

public class User {
    // Поля (переменные):
    private String family;
    private String name;
    private String middleName;
    private int yearOfBirthday;
    private String email;

    // Конструктор
    public User(String family, String name, String middleName, int yearOfBirthday, String email) {
        this.family = family;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirthday = yearOfBirthday;
        this.email = email;
    }

    // getters / setters
    public String getFamily() {
        return family;
    }

    public String setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYearOfBithday() {
        return yearOfBirthday;
    }

    public int setYearOfBithday(int yearOfBithday) {
        this.yearOfBirthday = yearOfBithday;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
    }
}
