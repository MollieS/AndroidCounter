package com.example.molliestephenson.counter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NumberChangerTest {

    @Test
    public void increasesANumber() {
        NumberChanger increaser = new Increaser();
        int increasedNumber = increaser.changeNumber(0);
        assertEquals(1, increasedNumber);
    }

    @Test
    public void decreasesNumber() {
        NumberChanger decreaser = new Decreaser();
        int decreasedNumber = decreaser.changeNumber(1);
        assertEquals(0, decreasedNumber);
    }
}
