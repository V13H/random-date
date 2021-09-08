package com.hvs;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.ThreadLocalRandom;

public class LocalDateRandom {
    public static LocalDate get(int minYear, int maxYear, boolean inclusively) {
        int yearRandom = getIntRandom(minYear, maxYear, inclusively);
        int monthRandom = getIntRandom(1, 12, true);
        Month month = Month.of(monthRandom);
        int maxLength = month.maxLength();
        int dayOfMonthRandom = getIntRandom(1, maxLength, true);
        return LocalDate.of(yearRandom,month,dayOfMonthRandom);
    }

    private static int getIntRandom(int min, int max, boolean inclusively) {
        if (inclusively) {
            return ThreadLocalRandom.current().nextInt(min, max + 1);
        } else {
            return ThreadLocalRandom.current().nextInt(min + 1, max);
        }
    }
}
