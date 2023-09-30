package ru.otus.sansanpetrov.homework10lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook(
                ("Vasya", Arrays.asList("+79991112233", "+79993334455")));
//        ("Иванов", Arrays.asList("+78889993322"));
//        ("Сидоров Иван", Arrays.asList("+79992226677"))
//);
        contacts.add("Petya", "+79995557799");
    }
}
