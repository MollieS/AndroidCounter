package com.example.molliestephenson.counter;

public class Increaser implements NumberChanger {
    public int changeNumber(int number) {
        return ++number;
    }
}
