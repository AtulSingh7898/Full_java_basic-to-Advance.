package Metrix;

import java.util.Arrays;

public class MatrixOperations {

    // Matrix Addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols]; // Create result matrix

        // Add each element of A and B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    //Matrix Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        // Subtract each element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    //Matrix Multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows1 = A.length;
        int cols1 = A[0].length;
        int cols2 = B[0].length;

        int[][] result = new int[rows1][cols2];

        // Multiply matrices using standard rule
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    //Transpose of a Matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        // Swap rows with columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    //Check for Identity Matrix  
    public static boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;

        // Check if all diagonal = 1 and others = 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) return false;
                else if (i != j && matrix[i][j] != 0) return false;
            }
        }

        return true;
    }

    //Check for Symmetric Matrix
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }

        return true;
    }

    //Rotate Matrix by 90° Clockwise (In-place for square matrix)
    public static void rotate90(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    //Rotate Matrix by 180°
    public static void rotate180(int[][] matrix) {
        int n = matrix.length;

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        // Reverse the rows order (top to bottom)
        int top = 0, bottom = n - 1;
        while (top < bottom) {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
    }

    // Helper to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    //MAIN FUNCTION
    public static void main(String[] args) {

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        //  Matrix Addition
        System.out.println("Addition of A and B:");
        int[][] added = addMatrices(A, B);
        printMatrix(added);

        //  Matrix Subtraction
        System.out.println("Subtraction of A and B:");
        int[][] subtracted = subtractMatrices(A, B);
        printMatrix(subtracted);

        //  Matrix Multiplication
        System.out.println("Multiplication of A and B:");
        int[][] multiplied = multiplyMatrices(A, B);
        printMatrix(multiplied);

        //  Transpose
        System.out.println("Transpose of A:");
        int[][] transposed = transposeMatrix(A);
        printMatrix(transposed);

        //  Identity Matrix Check
        int[][] identity = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        System.out.println("Is Identity Matrix? " + isIdentityMatrix(identity)); // true

        //  Symmetric Matrix Check
        int[][] symmetric = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        System.out.println("Is Symmetric Matrix? " + isSymmetric(symmetric)); // true

        //  Rotate 90°
        System.out.println("Matrix A rotated 90° clockwise:");
        rotate90(A);
        printMatrix(A);

        //  Rotate 180°
        System.out.println("Matrix B rotated 180°:");
        rotate180(B);
        printMatrix(B);
    }
}
