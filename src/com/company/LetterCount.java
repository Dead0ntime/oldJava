package com.company;

import java.awt.*;

public class LetterCount {
    public static void main(String[] args) {
        String phrase[] = {
                "Всып0ть по первое число",
                "Гнаться за длинным рублём",
                "В час по чайной ложке",
                "Каждый кулик своё болото хвалит",
                "За тридевять земель",
                "За душой ничего нет",
                "Семь пядей во лбу",
                "Этот дивный новый мир"
        };
        int[] letterCount = new int[33];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count].toUpperCase();
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ((lett >= 'А') & (lett <= 'Я')) {
                    letterCount[lett - 'А']++;
                } else if (lett == 'Ё') {
                    letterCount[32]++;
                }
            }
        }
        for (char count = 'А'; count <= 'Е'; count++) {
            System.out.println(count + ": " + letterCount[count - 'А']);
        }
        System.out.println("Ё" + ": " + letterCount[32]);
        for (char count = 'Ж'; count <= 'Я'; count++) {
            System.out.println(count + ": " + letterCount[count - 'А']);

        }
        int abc = 'Б';
        System.out.println(abc);
    }
}
