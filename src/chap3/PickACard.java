package chap3;

import java.util.Scanner;

public class PickACard {
    public static void main(String[] args) {

        int card = (int)(Math.random() * 52);

        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King"
        };

        String[] suits = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String rank = ranks[card % 13];
        String suit = suits[card / 13];

        System.out.println(
                "The card you picked is "
                        + rank + " of " + suit);
    }
}