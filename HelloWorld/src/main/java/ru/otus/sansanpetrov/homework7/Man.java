package ru.otus.sansanpetrov.homework7;

import java.util.regex.Pattern;

public class Man {
    // Поля
    private String name;
    private Travel currentTransport;
    private String nameTrans;


    // Конструктор
    public Man(String name, Travel currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    // getters

    public String getName() {
        return name;
    }

    public Travel getCurrentTransport() {
        return currentTransport;
    }

    // Методы
    // Очеловечиваем названия классов транспорта
    public void namesTransport(Travel currentTransport) {
        nameTrans = "";
        if (currentTransport == null) {
            return;
        }
        if (currentTransport != null) {
            if (currentTransport.getClass().getName().equals("ru.otus.sansanpetrov.homework7.Bicycle")) {
                nameTrans = "велосипед";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.sansanpetrov.homework7.Car")) {
                nameTrans = "машину";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.sansanpetrov.homework7.Horse")) {
                nameTrans = "лошадь";
            }
            if (currentTransport.getClass().getName().equals("ru.otus.sansanpetrov.homework7.AllTerrainVehicle")) {
                nameTrans = "вездеход";
            }
        }
    }

    // Человек выбирает виды транспорта
    public void kindOfTransport(Travel transport) {
        //     namesTransport(transport);
        if (currentTransport == null) {
            System.out.println(name + " идет пешком");
        } else {
            namesTransport(transport);
            System.out.println(name + " сел на " + nameTrans);
        }
    }

    // Перемещаемся на расстояние
    public void travellingMan(int distance, Terrain territory) {
        if (currentTransport == null) {
            System.out.println(name + " прошел дистанцию успешно");
        } else {
            currentTransport.moving(distance, territory);
        }
    }
}

