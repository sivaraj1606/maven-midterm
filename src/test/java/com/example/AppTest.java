package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    
    App app = new App();

    @Test
    public void testEvenOdd() {
        assertEquals("Even", app.checkEvenOdd(10));
        assertEquals("Odd", app.checkEvenOdd(7));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(15, app.sumOfDigits(12345));
    }

    @Test
    public void testReverseNumber() {
        assertEquals(54321, app.reverseNumber(12345));
        assertEquals(-321, app.reverseNumber(-123));
    }
}
