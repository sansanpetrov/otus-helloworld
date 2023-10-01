package ru.otus.sansanpetrov.homework10lesson16;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    // Поля
    private String fullName;
    private ArrayList<String> phoneList;
    private String phoneNumber;
    private HashMap<String, ArrayList<String>> contacts = new HashMap<>();


    // Конструктор

    public PhoneBook() {
        this.contacts = contacts;
    }

    // Getters / setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<String> phoneList) {
        this.phoneList = phoneList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HashMap<String, ArrayList<String>> getContacts() {
        return contacts;
    }

    public void setContacts(HashMap<String, ArrayList<String>> contacts) {
        this.contacts = contacts;
    }

    // Main methods
    // Добавляем запись имя- телефон (один!). Не проверяем, есть ли уже этот телефон или нет.
    public void add(String fullName, String phoneNumber) {
        ArrayList<String> listNew = new ArrayList<>();
        // Проверяем, есть ли запись
        if (contacts.containsKey(fullName)) {
            System.out.println("Такое имя уже есть. Пробую добавить номер.");
            listNew = contacts.get(fullName);
            if (listNew.contains(phoneNumber)) {
                System.out.println("Такой номер телефона уже есть. Добавление не нужно.");
            } else {
                System.out.println("Новый номер добавлен.");
                listNew.add(phoneNumber);
                contacts.put(fullName, listNew);
            }
        } else { // Добавляем запись, если отсутствует
            System.out.println("Добавил новую запись в телефонную книгу.");
            listNew.add(phoneNumber);
            contacts.put(fullName, listNew);
        }
    }

    // Выполняем поиск номеров по имени
    public ArrayList<String> find(String fullName) {
        return contacts.get(fullName);
    }

    // Проверяем наличие телефона в справочнике
    public void containsPhoneNumber(String phoneNumber) {
        ArrayList<String> listNew = new ArrayList<>();
        for (String  fullName : contacts.keySet()) {
            listNew = contacts.get(fullName);
            if (listNew.contains(phoneNumber)) {
                System.out.println("Имя контакта, у которого найден данный номер: " + fullName);
            }
        }
    }
}
