package ru.otus.sansanpetrov.homework10lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    // Поля
    private Map<String, List<String>> contacts; // Массив ФИО и соответствующего списка телефонов

//    // Конструктор
//    public PhoneBook() {
//        this.contacts = new HashMap<>(); // Делаем так!
//    }

    // Getters / setters
    public Map<String, List<String>> getContacts() {
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
    public List<String> find(String fullName) {
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

