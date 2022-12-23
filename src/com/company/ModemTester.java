package com.company;

public class ModemTester {
    public static void main(String[] args) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        Commodore64Modem commod = new Commodore64Modem();
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        commod.speed = 300;
        System.out.println("Попытка подключения кабельного модема:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect();
        System.out.println("Попытка подключения DSL-модема:");
        gateway.displaySpeed();
        gateway.connect();
        System.out.println("Попытка подключения 64-модема:");
        commod.displaySpeed();
        commod.connect();
    }
}
