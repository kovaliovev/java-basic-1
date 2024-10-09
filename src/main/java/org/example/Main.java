package org.example;

public class Main {
    public static void main(String[] args) {

        MatrixCalculator matrixCalculator = new MatrixCalculator(5, 5);
        long[][] matrix = matrixCalculator.generateRandomMatrix();

        System.out.println("Згенерована матриця:");
        matrixCalculator.printMatrix(matrix);

        long[][] transposedMatrix = matrixCalculator.transpose(matrix);
        System.out.println("Транспонована матриця:");
        matrixCalculator.printMatrix(transposedMatrix);

        long sum = matrixCalculator.sumOfMinInColumns(transposedMatrix);
        System.out.println("Сума найменших елементів у кожному стовпці транспонованої матриці: " + sum);
    }
}