package ru.otus.sansanpetrov.homework13lesson20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client connected.");
            mathOperation(client);
        }
    }

    private static void mathOperation(Socket client) throws IOException {
        Float result;
        String number;
        BufferedReader listener = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        System.out.println("Сетевой калькулятор может вычислять следующие математические операции: +,-,*,/");
        out.write("Сетевой калькулятор может вычислять следующие математические операции: +,-,*,/");
        while (true) {
            System.out.println("Введите первое число: ");
            out.write("Введите первое число: ");
            number = listener.readLine().trim();
            System.out.println(number);
            Float number1 = Float.valueOf(number);

            System.out.println("Введите второе число: ");
            out.write("Введите второе число: ");
            number = listener.readLine().trim();
            System.out.println(number);
            Float number2 = Float.valueOf(number);


            System.out.println("Введите знак операции: ");
            String operation = listener.readLine();
            System.out.println(operation);
            while (operation == null || operation.trim().isEmpty()) {
                System.out.println("Пожалуйста введите знак операции ");
                break;
            }
            if (operation.equals("+")) {
                result = number1 + number2;
                out.write(result.toString());
            }
            if (operation.equals("-")) {
                result = number1 - number2;
                out.write(result.toString());
            }
            if (operation.equals("*")) {
                result = number1 * number2;
                out.write(result.toString());
            }
            if (operation.equals("/")) {
                result = number1 / number2;
                out.write(result.toString());
            } else {
                System.out.println("Неправильный знак операции");
            }
        }
    }
}
