package com.company;

public class grade {
    public static void main(String[] args) {
        int grade = Integer.parseInt(args[0]);

        if (grade <= 29) {
            System.out.println("Твоя оценка F");
        } else if (grade <= 55) {
            System.out.println("Твоя оценка C");
        } else if (grade <= 80) {
            System.out.println("Твоя оценка B");
        } else if (grade <= 100){
            System.out.println("Твоя оценка A");
        } else {
            System.out.println("Юля SadCat");
        }
    }
}
