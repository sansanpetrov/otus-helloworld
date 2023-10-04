package ru.otus.sansanpetrov.homework13lesson20.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");
                sqrt(socket);
            }
        }
    }
    private static int sqrt(Socket socket) {
        BufferedReader listener = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
}
