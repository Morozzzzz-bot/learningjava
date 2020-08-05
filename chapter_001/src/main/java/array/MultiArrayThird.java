package array;

import java.util.Arrays;

public class MultiArrayThird {
    public static double[][][] multiDouble(int arr, int row, int cell, double start, double finish) {
        double[][][] arraysOne = new double[arr][row][cell];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cell; j++) {
                for (int k = 0; k < 0; k++) {
                    for (double index = start; index < finish; index++) {
                        arraysOne[i][j][k] = index * k;
                    }
                }

            }
        }
        return arraysOne;
    }

    public static String printArrays(double[][][] rsl) {
        String array = Arrays.deepToString(rsl);
        return array;
    }
}
