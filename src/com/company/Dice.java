package com.company;

import java.util.*;

public class Dice {
    public static void main (String[] args) {
        Random generator = new Random();
        double value = generator.nextInt(100);
        System.out.println("Случайное число " + value);
    }
}
