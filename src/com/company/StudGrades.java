package com.company;

public class StudGrades {
    public static void main(String[] args) {
        int[][] StudentsGrades = new int[4][6];
        StudentsGrades[0][0] = 4;
        StudentsGrades[0][1] = 5;
        StudentsGrades[0][2] = 3;
        StudentsGrades[0][3] = 4;
        StudentsGrades[0][4] = 4;
        StudentsGrades[1][0] = 3;
        StudentsGrades[1][1] = 4;
        StudentsGrades[1][2] = 2;
        StudentsGrades[1][3] = 4;
        StudentsGrades[1][4] = 3;
        StudentsGrades[1][5] = 3;
        StudentsGrades[2][0] = 5;
        StudentsGrades[2][1] = 4;
        StudentsGrades[2][2] = 5;
        StudentsGrades[2][3] = 4;
        StudentsGrades[2][4] = 4;
        StudentsGrades[2][5] = 4;
        StudentsGrades[3][0] = 4;
        StudentsGrades[3][1] = 5;
        StudentsGrades[3][2] = 5;
        StudentsGrades[3][3] = 5;
        double grades = 0;
        int allGrades = 0;
        int countGrades = 0;
        int countStGrades = 0;
        for (int i = 0; i < StudentsGrades.length; i++) {
            grades = 0;
            countStGrades = 0;
            for (int j = 0; j < StudentsGrades[i].length; j++) {
                if (StudentsGrades[i][j] != 0) {
                    grades += StudentsGrades[i][j];
                    allGrades += StudentsGrades[i][j];
                    countGrades++;
                    countStGrades++;
                }
            }
            System.out.println("Средняя оценка ученика " + (i + 1) + " равняется " + grades / countStGrades);
        }
        System.out.println("Средняя оценка всех учеников равняется " + allGrades / countGrades);
    }
}
