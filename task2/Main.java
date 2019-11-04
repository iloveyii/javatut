
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;


class Card {
    private String sender = "";

    public Card(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return this.sender;
    }

    public void printCard() {
        System.out.println("          <Card>          ");
        System.out.println("================================ ");
        System.out.println("Sender: " + this.getSender());
        System.out.println("================================");
        System.out.println();
        System.out.println();
    }

    public String toString() {
        String output = "";
        output += ("          <Card>          ");
        output += ("================================ ");
        output += ("Sender: " + this.getSender());
        output += ("\n");

        return output;
    }

}

class HandDrawn extends Card {
    private boolean niceDrawing = false;

    public HandDrawn(String sender, boolean niceDrawing) {
        super(sender);
        this.niceDrawing = niceDrawing;
    }

    public boolean setNiceDrawing(boolean niceDrawing) {
        return this.niceDrawing = niceDrawing;
    }

    public boolean getNiceDrawing() {
        return this.niceDrawing;
    }

    @Override
    public void printCard() {
        System.out.println("          <HandDrawn>          ");
        System.out.println("================================");
        System.out.println("Sender: " + this.getSender());
        System.out.println("Nice Drawing: " + this.getNiceDrawing());
        System.out.println("================================");
        System.out.println();
        System.out.println();
    }

    public String toString() {
        String output = "";
        output += ("          <HandDrawn>          \n");
        output += ("================================ \n");
        output += ("Sender: " + this.getSender() + "\n");
        output += ("Nice Drawing: " + this.getNiceDrawing() + "\n");
        output += ("\n\n");

        return output;
    }
}

class Main {

    public Main() {
        System.out.println("Constructor of Main");
    }

    public static void printAllCards(List cards) {
        int length = cards.size();

        for (int i = 0; i < length; i++) {
            Card card = (Card) cards.get(i);
            card.printCard();
        }
    }


    public static void main(String args[]) {

        List<Card> cards = new ArrayList<>();

        HandDrawn card1 = new HandDrawn("Anan", true);
        HandDrawn card2 = new HandDrawn("Kalle", false);
        Card card3 = new Card("Alex");

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        // System.out.println(cards);

        printAllCards(cards);


    }


}