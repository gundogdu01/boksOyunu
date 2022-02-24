package com.company;

public class Main {

    public static void main(String[] args) {
        Fighter mali =new Fighter("MUHAMMED ALİ", 15, 100, 110, 30);
        Fighter mike = new Fighter("MIKE TYSON", 10, 100, 105, 40);
        Ring r = new Ring(mali, mike, 90, 115, 10);
        r.run();
    }
}
