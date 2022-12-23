package com.company;

public class kvkorenArg {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Квадратный корень из " + args [0]
                + " равен "
                + Math.sqrt(number)
        );
    }
}
