
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        // A R R A Y S
        int[] rollNumbers = {3, 5, 9, 2, 6}; // 0 indexed
        System.out.println("Length : " + rollNumbers.length);
        rollNumbers[2] = 12;

        System.out.println("Elements of array");
        printArray(rollNumbers);

        // 2D Arrays - can have different row length
        int[][] matrix = {{1, 2, 22}, {3, 4}, {5, 6, 7}};
        System.out.println("Elements of matrix");
        printArray(matrix);

        System.out.println("Print array using for loop");

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i]; // Take row by row
            int rowLength = row.length;

            for (int j = 0; j < rowLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Arrays collection

        ArrayList<Integer> varRolls = new ArrayList<Integer>();

        int randomMax = (int)(Math.random() * 20);
        System.out.println("Random max is :" + randomMax);

        for(int i = 0; i < randomMax; i++) {
            varRolls.add((int)(Math.random() * 50));
        }

        // varRolls.remove();
        // varRolls.contains();

        int counter = 1;
        for(int e : varRolls) {
            System.out.println(counter++ + ": " + e);
        }

    }

    // Polymorphism
    public static void printArray(int[] arr) {

        for (int e : arr) {
            System.out.println(e);
        }
    }

    public static void printArray(int[][] arr) {

        for (int e[] : arr) {
            printArray(e);
        }
    }





}