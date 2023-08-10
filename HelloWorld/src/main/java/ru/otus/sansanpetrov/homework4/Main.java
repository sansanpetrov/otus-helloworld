package ru.otus.sansanpetrov.homework4;

import java.time.Year;
public class Main {
    // Создаем массив из 10 пользователей
    public static void main (String args[]) {
User[] users = {
        new User("Рыжов", "Василий", "Петрович", 1934, "figvam@www.org"),
        new User("Пупкин", "Вася", "Хренович", 1940, "figvam2@www.org"),
        new User("Хренов", "Гоша", "Натерович", 2000, "figvam3@www.org"),
        new User("Васьков", "Александр", "Петрович", 2022, "figvam4@www.org"),
        new User("Фигван", "Навсегда", "Стоянович", 1999, "figvam5@www.org"),
        new User("Забодаев", "Заблуд", "Васильевич", 2004, "figvam6@www.org"),
        new User("Рыжков", "Алаверды", "Чухонович", 1968, "figvam7@www.org"),
        new User("Рыков", "Тыжны", "Якутович", 2012, "figvam8@www.org"),
        new User("Ногувыше", "Прыжок", "Шестович", 1986, "figvam9@www.org"),
        new User("Фогс", "Виллиам", "Восемьдесятднейвокругсветович", 1918, "figvam10@www.org")
};
// Отсчитываем границу 40 лет от текущего года
        int year = Year.now().getValue();
        for (int i = 0; i < users.length; i++) {
            if((year - users[i].getYearOfBirthday()) > 40) {
             System.out.println(users[i].getFamily() + ", " + users[i].getName() + ", " + users[i].getMiddleName() + ", " + users[i].getYearOfBirthday() + ", " + users[i].getEmail());
                }
            }
    }
}
