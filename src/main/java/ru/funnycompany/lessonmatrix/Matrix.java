package ru.funnycompany.lessonmatrix;

public class Matrix {
    private int[][] data;
    private int row = 0;
    private int col = 0;

    public Matrix(int[][] data){
        this.row    = data.length;
        this.col = data[0].length;
        this.data = data;
    }




    public void getRC(){
        System.out.println("row " + row + " col " + col);
    }

    public void subMatrix(){
        for (int i=0; i<row; i++ ){
            for(int j=0; j<col; j++){
                data[i][j] = -data[i][j];
            }
        }
    }

    public void iterMatrix(){

    }

    public Matrix sumMatrix(Matrix matrix){

        for (int i=0; i<matrix.row; i++ ){
            for(int j=0; j<matrix.col; j++){
                matrix.data[i][j] = data[i][j] + matrix.data[i][j];
            }
        }
        return matrix;
    }

    public Matrix substractMatrix(Matrix matrix){
        matrix.subMatrix();
        for (int i=0; i<matrix.row; i++ ){
            for(int j=0; j<matrix.col; j++){
                matrix.data[i][j] = data[i][j] + matrix.data[i][j];
            }
        }
        return matrix;
    }

    public void getMatrix(){
        for (int i=0; i<row; i++ ){
            for(int j=0; j<col; j++){
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }

    public void transposeMatrix(){
        for (int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
                int temp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = temp;
            }
        }
    }

    
}

