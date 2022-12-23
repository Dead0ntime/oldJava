package com.company;
public class krat13 {
    public static void main(String[] args) {
        int[] kratno13 = new int [400];
        for (int i = 1; i < 401; i++) {
        kratno13 [i - 1] = i * 13;
        System.out.println(kratno13[i-1]);
        }
    }
}
