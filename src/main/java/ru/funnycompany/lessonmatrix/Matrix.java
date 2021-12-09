package ru.funnycompany.lessonmatrix;

public class Matrix {

    private int[][] data;
    private int row = 0;
    private int col = 0;


    public Matrix(int[][] data){
        this.row = data.length;
        this.col = data[0].length;
        this.data = data;
    }


    public Matrix(int row, int col) {
        if (row < 0 || col < 0) {
            System.out.println(" Отрицальные столбцы или строки");
            return;
        }
        this.row = row;
        this.col = col;
        this.data = new int[row][col];
    }


    public void getRC() {
        System.out.println("row " + row + " col " + col);
    }


    private Matrix subMatrix() {
        Matrix resultMatrix = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resultMatrix.data[i][j] = -data[i][j];
            }
        }
        return resultMatrix;
    }


    public Matrix sumMatrix(Matrix matrix) {
        Matrix resultMatrix = new Matrix(row, col);
        if (this.isMatrixSame(matrix)) {
            for (int i = 0; i < matrix.row; i++) {
                for (int j = 0; j < matrix.col; j++) {
                    resultMatrix.data[i][j] = data[i][j] + matrix.data[i][j];
                }
            }
            return resultMatrix;
        }
        System.out.println("Размеры матриц не совпадают");
        return null;
    }


    public boolean isMatrixSame(Matrix matrix) {
        return row == matrix.row && col == matrix.col;
    }


    public Matrix subtractMatrix(Matrix matrix) {
        return this.sumMatrix(matrix.subMatrix());
    }


    public void getMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }


    public Matrix transposeMatrix() {
        Matrix resultMatrix = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = data[i][j];
                resultMatrix.data[i][j] = data[j][i];
                resultMatrix.data[j][i] = temp;
            }
        }
        return resultMatrix;
    }


    public Matrix multiplyMatrix(Matrix matrix) {
        Matrix resultMatrix = new Matrix(row, matrix.col);
        if (row != matrix.col) {
            System.out.println("Умножение невозможно");
            return null;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix.col; j++) {
                for (int k = 0; k < col; k++) {
                    resultMatrix.data[i][j] += data[i][k] * matrix.data[j][k];
                }
            }
        }
        return resultMatrix;
    }

}

