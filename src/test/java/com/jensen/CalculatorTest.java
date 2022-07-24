package com.jensen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
Calculator cal = new Calculator();

    @Test
    void testSetAndGetFirstValue() {
        cal.setFirstValue(5);
        assertEquals(5.0,cal.getFirstValue());
        System.out.println(cal.getFirstValue());
    }

    @Test
    void testSetAndGetSecondValue() {
        cal.setSecondValue(10);
        assertEquals(10, cal.getSecondValue());
        System.out.println(cal.getSecondValue());
    }

    @Test
    void testDivide() {
        cal.Division(4, 2);
        assertEquals(2, cal.getResult());
        System.out.println(cal.getResult());
    }
}