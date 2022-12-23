package com.company;

public class PlanetWeight {
    public static void main(String[] args) {
        System.out.print("Ваш вес на Земле будет ");
        Double weight = Double.parseDouble(args [0]);
        System.out.println(weight);

        System.out.print("Ваш вес на Меркурии будет ");
        double mercury = weight * .378;
        System.out.println(mercury);

        System.out.print("Ваш вес на Луне будет ");
        double moon = weight * .166;
        System.out.println(moon);

        System.out.print("Ваш вес на Юпитере будет ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}
