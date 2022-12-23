package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Tan4iki {
    public static void main(String[] args) throws IOException {

        int tankX = 5;
        int tankY = 5;
        int[] obstclX = {3, 5};
        int[] obstclY = {4, 6};

        List<Integer> shootXm = new ArrayList<Integer>();
        List<Integer> shootYm = new ArrayList<Integer>();
        List<String> shootDirections = new ArrayList<String>();
// ???

        String lastDirection = "w";

        while (true) {
            for (int y = 0; y < 12; y++) {
                if (y == 0)
                    System.out.println("------------");
                else if (y == 11)
                    System.out.println("------------");
                else {
                    String str = "";
                    for (int x = 0; x < 12; x++) {
                        boolean doesObstclExists = false;
                        for (int i = 0; i < obstclX.length && i < obstclY.length; i++) {
                            if (x == obstclX[i] && y == obstclY[i]) {
                                doesObstclExists = true;
                                str += "H";
                            }
                        }
                        boolean doesShootDotExists = false;
                        for (int i = 0; i < shootXm.size() && i < shootYm.size(); i++) {
                            if (x == shootXm.get(i) && y == shootYm.get(i)) {
                                doesShootDotExists = true;
                                str += ".";
                            }
                        }
                        //как с танком сделать коллизию шут-обсткл
                        if (!doesShootDotExists && !doesObstclExists) {
                            if (x == 0)
                                str += "|";
                            else if (x == 11)
                                str += "|";
                            else if (x == tankX && y == tankY)
                                str += "@";
                            else
                                str += " ";
                        }

                    }
                    System.out.println(str);
                }
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String usersAnswer = "";
            usersAnswer = br.readLine().toLowerCase();

            boolean doesObstclExistsNear = false;
            switch (usersAnswer) {
                case "s":
                    lastDirection = "s";
                    for (int i = 0; i < obstclX.length && i < obstclY.length; i++) {
                        if (obstclY[i] - tankY == 1 && obstclX[i] == tankX) {
                            doesObstclExistsNear = true;
                        }
                    }
                    if (tankY < 10 && doesObstclExistsNear == false) {
                        tankY++;
                    }
                    break;
                case "a":
                    lastDirection = "a";
                    for (int i = 0; i < obstclX.length && i < obstclY.length; i++) {
                        if (obstclX[i] - tankX == -1 && obstclY[i] == tankY) {
                            doesObstclExistsNear = true;
                        }
                    }
                    if (tankX > 1 && doesObstclExistsNear == false) {
                        tankX--;
                    }
                    break;
                case "w":
                    lastDirection = "w";
                    for (int i = 0; i < obstclX.length && i < obstclY.length; i++) {
                        if (obstclY[i] - tankY == -1 && obstclX[i] == tankX) {
                            doesObstclExistsNear = true;
                        }
                    }
                    if (tankY > 1 && doesObstclExistsNear == false) {
                        tankY--;
                    }
                    break;
                case "d":
                    lastDirection = "d";
                    for (int i = 0; i < obstclX.length && i < obstclY.length; i++) {
                        if (obstclX[i] - tankX == 1 && obstclY[i] == tankY) {
                            doesObstclExistsNear = true;
                        }
                    }
                    if (tankX < 10 && doesObstclExistsNear == false) {
                        tankX++;
                    }
                    break;
                case "e":
                    shootXm.add(tankX);
                    shootYm.add(tankY);
                    shootDirections.add(lastDirection);
                    break;
            }

            boolean wasShootRemoved = false;

            for (int i = 0; i < shootXm.size() && i < shootYm.size() && i < shootDirections.size(); ) {
                if (shootDirections.get(i) == "s") {
                    for (int j = 0; j < obstclY.length && j < obstclX.length; j++) {
                        if (shootYm.get(i) - obstclY[j] == -1 && shootXm.get(i) == obstclX[j]) {
                            shootYm.remove(i);
                            shootXm.remove(i);
                            shootDirections.remove(i);
                            wasShootRemoved = true;
                        }
                    }
                    if (shootYm.get(i) < 10 && !wasShootRemoved) {
                        shootYm.set(i, shootYm.get(i) + 1);
                        i++;
                    } else {
                        shootYm.remove(i);
                        shootXm.remove(i);
                        shootDirections.remove(i);
                    }
                } else if (shootDirections.get(i) == "a") {
                    for (int j = 0; j < obstclY.length && j < obstclX.length; j++) {
                        if (shootXm.get(i) - obstclX[j] == 1 && shootYm.get(i) == obstclY[j]) {
                            shootYm.remove(i);
                            shootXm.remove(i);
                            shootDirections.remove(i);
                            wasShootRemoved = true;
                        }
                    }
                    if (shootXm.get(i) > 1 && !wasShootRemoved) {
                        shootXm.set(i, shootXm.get(i) - 1);
                        i++;
                    } else {
                        shootYm.remove(i);
                        shootXm.remove(i);
                        shootDirections.remove(i);
                    }
                } else if (shootDirections.get(i) == "w") {
                    for (int j = 0; j < obstclY.length && j < obstclX.length; j++) {
                        if (shootYm.get(i) - obstclY[j] == 1 && shootXm.get(i) == obstclX[j]) {
                            shootYm.remove(i);
                            shootXm.remove(i);
                            shootDirections.remove(i);
                        }
                    }
                    if (shootYm.get(i) > 1 && !wasShootRemoved) {
                        shootYm.set(i, shootYm.get(i) - 1);
                        i++;
                    } else {
                        shootYm.remove(i);
                        shootXm.remove(i);
                        shootDirections.remove(i);
                    }
                } else if (shootDirections.get(i) == "d") {
                    for (int j = 0; j < obstclY.length && j < obstclX.length; j++) {
                        if (shootXm.get(i) - obstclX[j] == -1 && shootYm.get(i) == obstclY[j]) {
                            shootYm.remove(i);
                            shootXm.remove(i);
                            shootDirections.remove(i);
                        }
                    }
                    if (shootXm.get(i) < 10 && !wasShootRemoved) {
                        shootXm.set(i, shootXm.get(i) + 1);
                        i++;
                    } else {
                        shootYm.remove(i);
                        shootXm.remove(i);
                        shootDirections.remove(i);
                    }
                }

                if (tankX < 1) {
                    tankX = 1;
                }
                if (tankX > 10) {
                    tankX = 10;
                }
                if (tankY < 1) {
                    tankY = 1;
                }
                if (tankY > 10) {
                    tankY = 10;
                }
            }
        }
    }
}

//новый выстрел можно сделать только после того, как старый покинет пределы карты.
/*||  #-     || 3;n, 4 s -> 3;n-1, 1
        ||  |      ||
        ||         ||
        |||||||||||||

 препятствия + автообновление (вводить cls вконце цикла обновления) + враги
 if
 */