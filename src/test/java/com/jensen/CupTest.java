package com.jensen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CupTest {
    Cup cup2 = new Cup("water", 75.0);


    @Test
    void testObjectCreation() {
        Cup cup = new Cup("water", 70.0);
        assertEquals("water", cup.getLiquidType());
        assertEquals(70.0, cup.getPercentFull(), 0.0001);
    }

    @Test
    void testObjectCreationAssertAll() {
        Cup cup = new Cup("water", 75.0);
        assertAll("Correctly builds object",
                () -> assertEquals("water", cup.getLiquidType()),
                () -> assertEquals(75.0, cup.getPercentFull())
        );

    }

    @Test
    void testSetLiquidType() {
        cup2.setLiquidType("juice");
        assertEquals("juice", cup2.getLiquidType());
    }

    @Test
    void testPercentageThrows() {

        Throwable e = assertThrows(IllegalArgumentException.class,
                () -> cup2.setPercentFull(-1));
        assertEquals("Percent must be >=0 and <= 100", e.getMessage());
        System.out.println(e.getMessage());
        System.out.print("hej");
    }

    @Test
    void test1(){
        assertEquals("a", "a");
    }
    @Test
    void test2(){
        assertEquals("a", "a");
    }
    @Test
    void test3(){
        assertEquals("a", "a");
    }
    @Test
    void test4(){
        assertEquals("a", "a");
    }

}