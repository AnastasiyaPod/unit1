package ru.netology.service;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void testAmountWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testAmountMoreThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testAmountNotCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testMaxLimitAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testMinLimitAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testMaxAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testNotAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}