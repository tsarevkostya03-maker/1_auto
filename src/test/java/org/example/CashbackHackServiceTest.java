package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100, "При покупке на 900 нужно докупить 100");
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1500);
        Assert.assertEquals(result, 500, "При покупке на 1500 нужно докупить 500");
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        // Этот тест УПАДЁТ, потому что сервис возвращает 1000, а должно быть 0
        Assert.assertEquals(result, 0, "При покупке ровно на 1000 докупать ничего не нужно");
    }
}
