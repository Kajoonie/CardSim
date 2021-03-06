package com.desaerun;

public class Hand extends CardCollection {

    public Hand(String label) {
        super(label);
    }

    public Hand(String label, Card card) {
        super(label);
        addCard(card);
    }

    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
    }
}
