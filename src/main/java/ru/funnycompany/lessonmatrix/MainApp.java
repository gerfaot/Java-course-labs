package ru.funnycompany.lessonmatrix;

import org.w3c.dom.ls.LSOutput;

public class MainApp {
    public static void main(String[] args) {
        Matrix m2 = new Matrix(new int[][]{
                {1, 2, -2},
                {-3, 5, 6},
                {9, -8, 1}

        });
        Matrix m1 = new Matrix(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}

        });
        Matrix m3 = m1.sumMatrix(m2);
        m3.getMatrix();

        Matrix m4 = m1.substractMatrix(m3);
        m4.getMatrix();
        m4.transposeMatrix();
        m4.getMatrix();
    }
}
