package ru.funnycompany.lessonmatrix;

import org.w3c.dom.ls.LSOutput;

public class MainApp {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(new int[][]{
                {1, 2, -2},
                {-3, 5, 6},
                {9, -8, 1}

        });
        Matrix m2 = new Matrix(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}

        });
        Matrix m6 = new Matrix(3,2);
        Matrix m5 = new Matrix(3,3);
        m5 = m1.sumMatrix(m2);
        Matrix m7 = m2.sumMatrix(m6);
        //m5.getMatrix();
        //m7.getMatrix();

        //Matrix m3 = m1.sumMatrix(m2);
        //m3.getMatrix();
        Matrix m4 = m1.subtractMatrix(m2);
        m4.getMatrix();
        m5 = m4.transposeMatrix();
        m5.getMatrix();
        Matrix m8 = m1.multiplyMatrix(m2);
        m8.getMatrix();
    }

}
