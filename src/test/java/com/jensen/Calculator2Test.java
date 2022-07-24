package com.jensen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {
    Calculator2 A = new Calculator2();

    @Test
    void testAddTwoNumbers() {
        int addNum = A.add(7,4);
        assertEquals(11,addNum);
        System.out.println(addNum);
    }

    @Test
    void testMinusNumbers() {
        int sub = A.subtract(0,8);
        assertEquals(-8, sub);
        System.out.println(sub);

    }

    @Test
    void testDivideNumbers() {
        int Div = A.divide(2,2);
        assertEquals(1, Div);
        System.out.println(Div);

    }

}