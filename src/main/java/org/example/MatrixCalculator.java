package org.example;

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
}
