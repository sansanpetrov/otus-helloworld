package ru.otus.sansanpetrov.homework13lesson20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("Client connected.");
                mathOperation(client);
            }
        }
    }

    private static void mathOperation(Socket client) throws IOException {
        Float result;
        String number;
        BufferedReader listener = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        out.write("Сетевой калькулятор может вычислять следующие математические операции: +,-,*,/" + "\n");
        out.flush();
//        while (true) {
        out.write("Введите первое число: " + "\n");
        out.flush();
//        number = listener.readLine().trim();
         number = listener.readLine();
        System.out.println(number);
//        Float number1 = Float.valueOf(number);

//            out.write("Введите второе число: " + "\n");
//            out.flush();
//            number = listener.readLine().trim();
//            System.out.println(number);
//            Float number2 = Float.valueOf(number);
//
//            String operation = listener.readLine();
//            System.out.println(operation);
//            while (operation == null || operation.trim().isEmpty()) {
//                out.write("Пожалуйста введите знак операции " + "\n");
//                out.flush();
//                break;
//            }
//            if (operation.equals("+")) {
//                result = number1 + number2;
//                out.write(result.toString());
//            }
//            if (operation.equals("-")) {
//                result = number1 - number2;
//                out.write(result.toString());
//            }
//            if (operation.equals("*")) {
//                result = number1 * number2;
//                out.write(result.toString());
//            }
//            if (operation.equals("/")) {
//                result = number1 / number2;
//                out.write(result.toString());
//            } else {
//                System.out.println("Неправильный знак операции" + "\n");
//            }
        //       }
    }
}
