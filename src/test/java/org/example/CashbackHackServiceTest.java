package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(100, result);
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1500);
        assertEquals(500, result);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(0, result);
    }
}