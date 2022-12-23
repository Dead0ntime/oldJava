package com.company;

public class kvkorenNewArg {
    public static void main(String[] args) {
                System.out.println("Квадратный корень из " + args [0]
                + " равен "
                        //double в данном случае преобразовывает строку аргумента в число
                + Math.sqrt(Double.parseDouble(args [0]))
        );
    }
}
