package com.company;

public class Commodore64Modem extends Modem {
    String method = "64-подключение";

    public void  connect() {
        System.out.println("Подключение к Интернету...");
        System.out.println("Используем " + method);
    }
}
