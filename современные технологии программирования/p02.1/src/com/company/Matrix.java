package com.company;

public class Matrix {
    private int [][] array;
    private int row;
    private int col;

    //конструктор
    public Matrix(int row, int col){
        this.row = row;
        this.col = col;
        this.array = new int [row][col];
    }

    //заполняет матрицу рандомными цифрами (от 0 до 10)
    public void random_matrix(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    //возвращает массив
    public int [][] get_array(){
        return array;
        }
}
