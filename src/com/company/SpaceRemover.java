package com.company;

import java.awt.*;

public class SpaceRemover {
    public static void main(String[] args) {
        String mostFamous = "Рудольф - это олень с красным светящимся носом ";
        char[] mfl = mostFamous.toCharArray();
        for (int dex = 0; dex < mfl.length; dex++) {
            char current = mfl[dex];
            if (current != ' ') {
                System.out.print(current);
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
