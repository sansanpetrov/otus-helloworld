package ru.otus.sansanpetrov.homework7;

public interface Travel {
    // Метод перемещения на заданное расстояние
    boolean moving(int distance, int fuel);

    // Метод определения территории, по которой можно двигаться
    boolean terr(Terrain territory);
}
