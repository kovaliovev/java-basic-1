package org.example;

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
}
