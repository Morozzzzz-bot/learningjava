package array;

public class MultiDim {
    public static MultiArray[][] multi(int row, int cell) {
        MultiArray[][] arraysOne = new MultiArray[row][cell];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cell; j++) {
                arraysOne[i][j] = new MultiArray();

            }
        }
        return arraysOne;
    }
}
