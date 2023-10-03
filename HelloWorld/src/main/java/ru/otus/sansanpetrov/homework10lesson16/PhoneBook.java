package ru.otus.sansanpetrov.homework10lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class PhoneBook {
    // Поля
//    private String fullName; // ФИО, ключ для HashMap
//    private ArrayList<String> phoneList; // Список телефонов для одного ФИО (ключа)
//    private String phoneNumber; // Телефон, который будем добавлять к списку или вместе с новой записью
    private HashMap<String, ArrayList<String>> contacts = new HashMap<>(); // Массив ФИО и соответствующего списка телефонов

    // HashMap<String, ArrayList> -> "Map<String, List>" - можно так (из комментариев Михаила)
    //вспомни про интерфейсы
    //у листа тип стринг указываем просто гит не отображает то что я указал тебе в примере


    // Конструктор

    public PhoneBook() {
        HashMap<String, ArrayList<String>> contacts = new HashMap<>();
    }

    // Getters / setters
//    public String getFullName() {
//        return fullName;
//    }
//
//    public ArrayList<String> getPhoneList() {
//        return phoneList;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
    public HashMap<String, ArrayList<String>> getContacts() {
        return contacts;
    }

    // Main methods
    // Добавляем запись имя- телефон (один!).
    public void add(String fullName, String phoneNumber) {
        // Проверяем, есть ли запись
        if (contacts.containsKey(fullName)) {
            System.out.println("Такое имя уже есть. Пробую добавить номер.");
            if (contacts.get(fullName).contains(phoneNumber)) {
                System.out.println("Такой номер телефона уже есть. Добавление не нужно.");
            } else {
                System.out.println("Новый номер добавлен.");
                contacts.get(fullName).add(phoneNumber);
            }
        } else { // Добавляем запись, если отсутствует
            System.out.println("Добавил новую запись в телефонную книгу.");
            ArrayList<String> listNew = new ArrayList<>();
            listNew.add(phoneNumber);
            contacts.put(fullName, listNew);
        }
    }

    // Выполняем поиск номеров по имени
    public ArrayList<String> find(String fullName) {
        return contacts.get(fullName);
    }

    // Проверяем наличие телефона в справочнике
    public boolean containsPhoneNumber(String phoneNumber) {
        for (String fullName : contacts.keySet()) {
            if (contacts.get(fullName).contains(phoneNumber)) {
                System.out.println("Телефон " + phoneNumber + " есть в справочнике.");
                return true;
            }
        }
        return false;
    }
}

