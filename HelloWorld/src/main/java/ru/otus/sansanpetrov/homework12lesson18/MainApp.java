package ru.otus.sansanpetrov.homework12lesson18;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainApp {
    // Читаем файл
    public static void readFromFile(String file) throws java.io.FileNotFoundException {
        FileInputStream n1 = new FileInputStream(file);
        BufferedInputStream in2 = new BufferedInputStream(n1);
        InputStreamReader in = new InputStreamReader(in2);
        try (in) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    // Добавляем строчку в файл
    public static void writeInFile(String hello, String file) throws java.io.FileNotFoundException {
        //     String hello = "Привет, С Днюхой 555!!";
        FileOutputStream out1 = new FileOutputStream(file, true);
        BufferedOutputStream out = new BufferedOutputStream(out1);
        try (out) {
            byte[] buffer = hello.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            out.flush();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    // Выполняем пункты ДЗ:
    public static void main(String[] args) throws FileNotFoundException {
        String file = "src/main/java/ru/otus/sansanpetrov/homework12lesson18/files/test.txt";
        String hello = "\nПривет, с Дем Рождения!!";
        readFromFile(file);
        System.out.println();
        System.out.println();
        writeInFile(hello, file);
        readFromFile(file);
        System.out.println();
        System.out.println();
    }
}
