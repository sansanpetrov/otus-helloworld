package ru.otus.sansanpetrov.homework10lesson16;

import java.util.Objects;

public class Key {
    // Поле
    private String id;

    // Constructor (конструктор)
    public Key(String id) {
        this.id = id;
    }
    // getter / setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
