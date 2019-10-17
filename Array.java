
public class Array {

    public static void main(String[] args) {

        // A R R A Y S
        int[] rollNumbers = {3, 5, 9, 2, 6}; // 0 indexed
        System.out.println("Length : " + rollNumbers.length);
        rollNumbers[2] = 12;

        System.out.println("Elements of array");
        printArray(rollNumbers);

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("Elements of matrix");
        printArray2(matrix);


    }

    public static void printArray(int[] arr) {

        for (int e : arr) {
            System.out.println(e);
        }
    }

    public static void printArray2(int[][] arr) {

        for (int e[] : arr) {
                printArray(e);
        }
    }
}