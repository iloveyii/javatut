
import java.util.Scanner;

public class Input {


    public static void main(String[] args) {

        // USER INPUT
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = keyboardInput.nextLine();
        System.out.println("Hej " + username);

        System.out.print("Enter your age :");
        int age = keyboardInput.nextInt();
        System.out.println("You are " + age + " years old");

        System.out.println(keyboardInput.hasNextLine());
    }

}