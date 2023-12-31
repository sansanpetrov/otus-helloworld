package ru.otus.sansanpetrov.homework12lesson18;


import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainApp {
    // Выводим список файлов .TXT в папке.
    // Код взял отсюда и модифицировал:
    // https://stackoverflow.com/questions/1844688/how-to-read-all-files-in-a-folder-from-java
    public static void listFilesInFolder(String path) {
        File tempDir = new File(path);
        for (File fileEntry : tempDir.listFiles()) {
            if (fileEntry.getName().lastIndexOf("txt") > 0) {
                System.out.println(fileEntry.getName());
            } else {
            }
        }
        System.out.println();
    }

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
    public static void main(String[] args) throws FileNotFoundException, InputMismatchException, IllegalStateException {
        // Определяем каталог, содержимое которого будет выводиться в консоль:
        String path = "src/main/java/ru/otus/sansanpetrov/homework12lesson18/files/";


        // Выводим список файлов *.txt в каталоге:
        listFilesInFolder(path);

        // Выводим запрос на имя файла, с которым будем работать:
        System.out.println("Пожалуйста введите имя файла и нажмите Enter:");
        Scanner scannerName = new Scanner(System.in);
        String fileName = scannerName.nextLine();


        // Соединяем путь к каталогу и имя:
        String file = path + fileName;
        System.out.println();

        // Выводим содержимое выбранного файла в консоль:
        readFromFile(file);
        System.out.println();
        System.out.println();

        // Определяем фразу, которую добавляем в файл:
        System.out.println("Пожалуйста введите фразу, которую запишете в файл, и нажмите Enter:");
        Scanner phrase = new Scanner(System.in);
        String enter = phrase.nextLine();
        String hello = "\n" + enter;
        System.out.println(hello);

        // Пишем в файл:
        writeInFile(hello, file);

        // Читаем файл:
        readFromFile(file);
        System.out.println();
        System.out.println();
    }
}
