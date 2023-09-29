package ru.otus.sansanpetrov.homework6lesson12;

public class CatFoodApplication {
    public static void main(String[] args) {
        Plate red = new Plate(100, 100);
        Cat[] mourr = {
                new Cat("Дымок", 10, false),
        new Cat("Черныш", 10, false),
        new Cat("Вася", 8, false),
        new Cat("Маркиза", 6, false),
        new Cat("Багира", 15, false),
        new Cat("Бусинка", 20, false),
        new Cat("Маруся", 30, false),
        new Cat("Боцман", 25, false),
        new Cat("Гарфилд", 15, false),
        new Cat("Ерофей", 23, false)
        };
        for (int i = 0; i < mourr.length; i++) {
            mourr[i].eat(red);
        }
    }
}
