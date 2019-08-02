/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sparkcaster
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cardhand;

    public Hand() {
        this.cardhand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cardhand.add(card);
    }

    public void print() {

        for (Card card : cardhand) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(cardhand);
    }

    public int handValue() {
        int value = 0;

        for (Card card : cardhand) {
            value += card.getValue();
        }
        return value;
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(cardhand, sorter);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.handValue() - hand.handValue();
    }
}
