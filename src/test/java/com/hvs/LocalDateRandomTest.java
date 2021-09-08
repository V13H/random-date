package com.hvs;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class LocalDateRandomTest {

    @Test
    public void randomDateTest_OK(){
        for (int i = 0; i < 31; i++) {
            LocalDate localDate = LocalDateRandom.get(1990, 2021, true);
            int year = localDate.getYear();
            assertTrue(year >= 1990);
            assertTrue(year <= 2021);
            System.out.println(localDate);
        }
    }
}