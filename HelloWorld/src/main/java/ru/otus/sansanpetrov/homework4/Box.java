package ru.otus.sansanpetrov.homework4;

public class Box {
    // Поля (переменные):
    private final int length;
    private final int width;
    private final int height;
    private String color;
    private Boolean openClose; // Состояние: или открыта, или закрыта
    private Boolean emptyFilled; // Считаем, что помещается только один предмет.

    // Конструктор
    public Box(int length, int width, int height, String color, Boolean openClose, Boolean emptyFilled) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.openClose = openClose; // true- коробка открыта
        this.emptyFilled = emptyFilled; // true- коробка пустая
    }

    // getters/setters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getOpenClose() {
        return openClose;
    }

    public void setOpenClose(Boolean openClose) {
        this.openClose = openClose;
    }

    public Boolean getEmptyFilled() {
        return emptyFilled;
    }

    public void setEmptyFilled(Boolean emptyFilled) {
        this.emptyFilled = emptyFilled;
    }

    // Методы
// Метод, печатающий информацию в консоль
    public void boxInfo() {
        System.out.println("Коробка: длина " + length + ", " + "ширина " + width + ", " + "высота " + height);
        System.out.println("Цвет коробки: " + color);
        if (openClose) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (emptyFilled) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("Коробка заполнена");
        }
    }

    // Открываем и закрываем коробку
    public void openBox() {  // Открываем закрытую коробку
        if (!openClose) {
            openClose = true;
            System.out.println("Открыли коробку");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void closeBox() { // Закрываем открытую коробку
        if (openClose) {
            openClose = false;
            System.out.println("Закрыли коробку");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    // Складываем и выкидываем предмет в/из открытой коробки
    public void putThing() {   // Кладем предмет в пустую коробку
        if (emptyFilled) {
            emptyFilled = false;
            System.out.println("Положили предмет в пустую коробку");
        } else {
            System.out.println("В коробке уже лежит предмет");
        }
    }

    public void getThing() { // Берем предмет из заполненной коробки
        if (!emptyFilled) {
            emptyFilled = true;
            System.out.println("Забрали предмет из коробку");
        } else {
            System.out.println("Коробка уже пустая");
        }
    }
}
