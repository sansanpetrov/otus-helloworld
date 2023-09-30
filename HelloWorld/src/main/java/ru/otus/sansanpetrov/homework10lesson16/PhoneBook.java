package ru.otus.sansanpetrov.homework10lesson16;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    // Поля
    private String fullName;
    private ArrayList<String> phoneList;
    private String phoneNumber;
    private HashMap<String, ArrayList<String>> contacts;

    // Конструктор

    public PhoneBook(HashMap<String, ArrayList<String>> contacts) {
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
            System.out.println("Такое имя уже есть. Добавляю новый телефон для нее.");
            listNew = contacts.get(fullName);
            listNew.add(phoneNumber);
            contacts.put(fullName, listNew);
        } // Добавляем запись, если отсутствует
        System.out.println("Добавил новую запись в телефонную книгу.");
        listNew.add(phoneNumber);
        contacts.put(fullName, listNew);
    }

    // Выполняем поиск номеров по имени
    public void find(String fullName) {
        contacts.get(fullName);
    }
    // Проверяем наличие телефона в справочнике
//    public void containsPhoneNumber(String phoneNumber) {
//        for (contacts.get():
//             ) {
//
//        }
//    }
}
