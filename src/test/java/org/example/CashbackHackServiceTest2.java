package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest2 {
    @Test
    public void shouldReturn100WhenAmount900() {
        CashbackHackService2 service = new CashbackHackService2();
        int result = service.remain(900);
        assertEquals(100, result);  // В JUnit4: assertEquals(expected, actual)
    }

    @Test
    public void shouldReturn500WhenAmount1500() {
        CashbackHackService2 service = new CashbackHackService2();
        int result = service.remain(1500);
        assertEquals(500, result);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        CashbackHackService2 service = new CashbackHackService2();
        int result = service.remain(1000);
        // Этот тест УПАДЁТ
        assertEquals(0, result);
    }
}
