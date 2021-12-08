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


    public Matrix subMatrix() {
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
        return resultMatrix;
    }

    public boolean isMatrixSame(Matrix matrix) {
        if (row != matrix.row || col != matrix.col) {
            return false;
        }
        return true;
    }

    public Matrix substractMatrix(Matrix matrix) {
        matrix.subMatrix();
        this.
        for (int i = 0; i < matrix.row; i++) {
            for (int j = 0; j < matrix.col; j++) {
                matrix.data[i][j] = data[i][j] + matrix.data[i][j];
            }
        }
        return matrix;
    }


    public void getMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }


    public void transposeMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
    }




}

