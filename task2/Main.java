
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

    public String printCard() {
        String output = "";
        output += ("          <Card>          ");
        output += ("================================ ");
        output += ("Sender: " + this.getSender());
        output += ("\n");

        return output;
    }

    public String toString() {
        return this.printCard();
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
    public String printCard() {
        String output = "";
        output += ("          <HandDrawn>          \n");
        output += ("================================ \n");
        output += ("Sender: " + this.getSender() + "\n");
        output += ("Nice Drawing: " + this.getNiceDrawing() + "\n");
        output += ("\n\n");

        return output;

    }

    public String toString() {
        return this.printCard();
    }
}

class Main {

    public Main() {
        System.out.println("Constructor of Main");
    }

    public static void printAllCards(List cards) {
        int length = cards.size();
        System.out.println("Lenght " + length);
        for (int i = 0; i < length; i++) {
            // List c = cards.get(i);
        }
    }


    public static void main(String args[]) {

        List<Card> cards = new ArrayList<>();

        HandDrawn card1 = new HandDrawn("Anan", true);
        HandDrawn card2 = new HandDrawn("Kalle", false);

        cards.add(card1);
        cards.add(card2);

        // printAllCards(cards);

        System.out.println(cards);

    }


}