
import java.util.Scanner;
import java.util.*;

public class Booking {
    boolean[][] booking = new boolean[3][5];

    static Scanner userInput = new Scanner(System.in);

    public Booking() {
    }

    public void printBooking() {

        System.out.println("      <TV>      ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(this.booking[i][j] == true ? " O " : " . ");
            }
            System.out.println("   ");
        }

        System.out.println("   ");
    }

    public void printMenu() {
        System.out.println("1. Book a seat ");
        System.out.println("2. View Booking ");
    }

    public void makeBooking() {
        System.out.println("Enter row(1-3) : ");
        int row = userInput.nextInt();
        if (row < 1 || row > 3) row = 0;
        System.out.println("Enter column(1-5) : ");
        int column = userInput.nextInt();
        if (column < 1 || column > 5) column = 0;

        if(this.booking[row - 1][column - 1] == true) {
            System.out.println("This seat is already booked, please book another seat");
        } else {
            this.booking[row - 1][column - 1] = true;
        }
    }

    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.printBooking();

        while (true) {
            booking.printMenu();
            int choice = userInput.nextInt();
            if (choice == 1) {
                booking.makeBooking();
            } else {
                booking.printBooking();
            }

        }
    }


}

// javac -d bin -sourcepath src src/com/ali/chat/Client.java

//  javac Booking.java  && java Booking