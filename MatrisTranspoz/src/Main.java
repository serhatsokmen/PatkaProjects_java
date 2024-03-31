import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int row = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Matrisin elemanlarını girin:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Girilen Matris:");
        printMatrix(matrix);

        int[][] inverseMatrix = invertMatrix(matrix);

        System.out.println("Matrisin Tersi:");
        printMatrix(inverseMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] invertMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        int[][] inverseMatrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                inverseMatrix[i][j] = matrix[j][i];
            }
        }

        return inverseMatrix;
    }
}


