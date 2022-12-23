package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {
    public static void main(String[] args) throws IOException {
        // 1 задание - спрашивать заново, если человек вбил пустой ответ (переспрашивать с уточнением)
        /* 2 задание - спрашивать хочет ли он перепройти викторину
        ("да" или "нет", иначе переспрашивать с уточнением)*/
        // 3 - сделать угадайку чисел - новый проект (generator.nextInt(100)) "атата", "хочешь ещё раз сыграть?"
        // (перевернуть строку/перевернуть цифры) - после массивов
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] questions = { "Вопрос первый: Как называется самая высокая гора на Земле?",
                "Назови имя главной актрисы сериала \"Queens Gambit?\"?",
                "Сколько в часах длятся все фильмы серии \"Властелин колец\" (с округлением до целого значения)?",
                "Назовите фамилию легендарного пулемётчика-героя Украины, который защищал блокпост на границе Кордона и Болот?",
                "И последний вопрос: из какого штата музыкальная группа Linkin Park?" };

        String[] answers = { "эверест", "аня", "11", "вист", "калифорния" };

        String usersAnswer = "";
        int score;

        do {
            score = 0;

            if (usersAnswer.isEmpty()) {
                System.out.println("Привет друг, для тебя мы подготовили небольшую викторину!\n" +
                        "Ты можешь вводить слова на кириллице и числа, желаем удачи!");
            }
            else System.out.println("И снова здравствуй.");

            for (int i = 0; i < questions.length && i < answers.length; i++){
                System.out.println(questions[i]);

                do {
                    usersAnswer = br.readLine().toLowerCase();
                    if (usersAnswer.isEmpty()) {
                        System.out.println("Вы не указали вашу догадку, введите текст");
                    } else if (usersAnswer.equals(answers[i])) {
                        score++;
                        System.out.println("Вы угадали!");
                    } else {
                        System.out.println("Вы не угадали");
                    }
                } while (usersAnswer.isEmpty());
            }

            System.out.println("Ваш результат по итогам прохождения викторины составил " + score + "/5");
            switch (score) {
                case 5:
                    System.out.println("Поздравляем, вы безупречно справились со всеми вопросами!");
                    break;
                case 4:
                    System.out.println("Поздравляем, вы справились очень хорошо!");
                    break;
                case 3:
                    System.out.println("Вы прошли тест достойно!");
                    break;
                case 2:
                    System.out.println("Садитесь, 2! Но это всё равно неплохо :)");
                    break;
                case 1:
                    System.out.println("Дайте угадаю, правильный ответ был только про гору? xD");
                    break;
                case 0:
                    System.out.println("Вам стоит ознакомиться с географией, современными сериалами, музыкой, стримами Мэда и вселеленной по произведениям Толкиена");
            }

            System.out.println("Хочешь ли ты перепройти викторину? (\"да\" или \"нет\")");
            do {
                usersAnswer = br.readLine().toLowerCase();
                if (usersAnswer.isEmpty()) {
                    System.out.println("Вы не указали ваш ответ.");
                }
            } while (usersAnswer.isEmpty());
        } while (usersAnswer.equals("да"));

        System.out.println("Спасибо за участие, пока.");
    }
}
/*___________
||  #-     || 3;n, 4 s -> 3;n-1, 1
||  |      ||
||         ||
|||||||||||||

 помещение + танк, которым можно управлять (как в нормальной игре) + препятствия + выстрел + автообновление (вводить cls вконце цикла обновления)
if */