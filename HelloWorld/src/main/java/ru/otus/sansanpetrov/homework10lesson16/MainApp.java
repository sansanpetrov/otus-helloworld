package ru.otus.sansanpetrov.homework10lesson16;


public class MainApp {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook();
        contacts.add("Petya", "+79995557799");
        contacts.add("Vasya", "phones");
        contacts.add("Vasya", "+7-916-999");
        contacts.add("Vasya", "phones-99999");
        contacts.add("Маша", "+7-916-333-22-33");
        contacts.add("Маша", "+7-000-111-22-33");
        contacts.add("Маша", "+7-000-111-22-33");
        contacts.add("Petya", "+7-916-333-22-33");
        System.out.println(contacts.getContacts());
        System.out.println(contacts.find("Petya"));
        contacts.containsPhoneNumber("+7-916-333-22-33");
    }
}
