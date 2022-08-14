package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    void shouldAdviseToBuyInAdditionFor100() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 900;
        int actual = cashbackHacker.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void shouldNotSayThatYouNeedToBuyMoreFor1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int amount = 1000;
        int actual = cashbackHacker.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}