package array;

import java.util.Arrays;

public class MultiArray {
    public static double[][] multiDouble(int row, int cell, double start, double finish) {
        double[][] arraysOne = new double[row][cell];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cell; j++) {
                for (double index = start; index < finish; index++) {
                    arraysOne[i][j] = index * j;
                }
            }
        }
        return arraysOne;
    }

    public static String printArrays(double[][] rsl) {
        String array = Arrays.deepToString(rsl);
        return array;
    }
}
