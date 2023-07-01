package com.gmail.zavsek_o2;

public class ArrayUtils {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int[] row : matrix) {
            if (row.length != columns) {
                return false;
            }
        }

        return rows == columns;
    }
}
