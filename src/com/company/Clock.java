package com.company;

import java.time.*;
import java.time.temporal.*;

public class Clock {
    public static void main(String[] args) {
        //определить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        //можно и так и так
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        //выводим приветствие
        if (hour < 6) {
            System.out.println("Доброй ночи!\n");
        } else if (hour < 12) {
            System.out.println("Доброе утро!\n");
        } else if (hour < 18) {
            System.out.println("Добрый день\n");
        } else {
            System.out.println("Добрейшего вечерочка\n");
        }
        //Начинаем отображать время
        System.out.print("Сейчас ");
        System.out.print(hour);
        /*
         можно сделать также System.out.print(LocalDateTime.now().getHour());
         или записать в переменную и выводить now.getHour()
         тогда проблем с секундами/минутами также не будет
        */
        System.out.print((hour != 1 & hour !=21) ?
                    " часа (часов) " : " час ");
        if (minute != 0) {
            System.out.print(minute);
            System.out.print((minute != 1 & minute != 21 &
                    minute != 31 & minute != 41 & minute != 51) ?
                    " минуты (минут)" : " минута");
        }
        // Отображение числа месяца
        System.out.print("\n" + day + " ");

        //Название месяца
        switch (month) {
            case 1 -> System.out.print("января");
            case 2 -> System.out.print("февраля");
            case 3 -> System.out.print("марта");
            case 4 -> System.out.print("апреля");
            case 5 -> System.out.print("мая");
            case 6 -> System.out.print("июня");
            case 7 -> System.out.print("июля");
            case 8 -> System.out.print("августа");
            case 9 -> System.out.print("сентября");
            case 10 -> System.out.print("октября");
            case 11 -> System.out.print("ноября");
            case 12 -> System.out.print("декабря");
        }
        // отображение года
        System.out.println(", " + year);
    }
}
