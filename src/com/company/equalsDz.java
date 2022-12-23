package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equalsDz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String guess;
        String favourite = "бензопила";

        guess = (args.length == 0) ? "" : args[0];

        if (guess.isEmpty()) {
            System.out.println("Вы не указали вашу догадку");
        } else if (guess.length() <= 3) {
            System.out.println("Вы указали слишком короткую догадку");
        } else if (favourite.equals(guess)) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали");
            //сделать викторину (br.readLine() - для считывания введённого текста)
            //в конце score по итогам викторины
        }

        String otvet1 = br.readLine();
        System.out.println(otvet1);
    }
}

