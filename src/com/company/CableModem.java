package com.company;

public class CableModem extends Modem {
    String method = "кабельное подключение";

    public void connect() {
        System.out.println("Подключение к Интернету...");
        System.out.println("Используем " + method);
    }
    public void disconnect() {
        System.out.println("Отключение от Интернета...");
    }
}
