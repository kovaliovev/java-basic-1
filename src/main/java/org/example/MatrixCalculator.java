package org.example;

import java.util.Arrays;
import java.util.Random;

public class MatrixCalculator {
    private final int rows;
    private final int columns;

    public MatrixCalculator() {
        this.rows = 3;
        this.columns = 3;
    }

    public MatrixCalculator(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new IllegalArgumentException("Rows and columns must be greater than 0");
        }
        this.rows = rows;
        this.columns = columns;
    }

    public long[][] generateRandomMatrix() {
        int minMatrixValue = -50;
        int maxMatrixValue = 50;

        Random random = new Random();
        long[][] matrix = new long[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(maxMatrixValue - minMatrixValue + 1) + minMatrixValue;
            }
        }
        return matrix;
    }

    public long[][] transpose(long[][] matrix) {
        long[][] transposedMatrix = new long[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public long sumOfMinInColumns(long[][] matrix) {
        long sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            long min = matrix[0][j];

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            sum += min;
        }
        return sum;
    }

    public void printMatrix(long[][] matrix) {
        for (long[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
