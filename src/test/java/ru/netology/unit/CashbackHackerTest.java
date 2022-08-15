package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldAdviseToBuyInAdditionFor100() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;
        int expected = 100;
        int actual = cashbackHacker.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSayThatYouNeedToBuyMoreFor1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;
        int actual = cashbackHacker.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}