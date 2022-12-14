package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {
    @Test
    public void cashback990() {
        CashbackHacker cashback = new CashbackHacker();

        int expected = 990;
        int bonus = 10;

        int actual = cashback.remain(bonus);

        assertEquals(expected, actual);
    }

    @Test
    public void cashback1000() {
        CashbackHacker cashback = new CashbackHacker();

        int expected = 1000;
        int bonus = 0;

        int actual = cashback.remain(bonus);

        assertEquals(expected, actual);
    }
    @Test
    public void cashback0() {
        CashbackHacker cashback = new CashbackHacker();

        int expected = 0;
        int bonus = 1000;

        int actual = cashback.remain(bonus);

        assertEquals(expected, actual);
    }

}


