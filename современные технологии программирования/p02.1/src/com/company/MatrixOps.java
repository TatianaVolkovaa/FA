package com.company;

public class MatrixOps {
    public int[][] m1;
    public int[][] m2;

    //конструктор
    public MatrixOps(int[][] m1, int[][] m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    //сумма матриц
    public int[][] sum_matrix() {
        int[][] summ = new int[m1.length][m1[0].length];
        if ((m1.length != m2.length) & (m1[0].length != m2[0].length)) {
            System.out.println("!!!!!ошибка!!!!!");
        }
        else {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    summ[i][j] = m1[i][j] + m2[i][j];
                }
            }
        }
        return summ;
    }

    //умножение на число
    public int[][] mul_by_number(int[][] m, int number) {
        int[][] mul = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mul[i][j] = m[i][j] * number;
            }
        }
        return mul;
    }

    //умножение на матрицу
    public int[][] mul_by_matrix(int[][] a, int[][] b) {
        int[][] mul = new int[Math.min(a.length, b.length)][Math.min(a[0].length, b[0].length)];
        if ((a.length != b[0].length) | (a[0].length != b.length)) {
            System.out.println("!!!!!ошибка!!!!!");
        }
        else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return mul;
    }

    //возведение в степень
    public int[][] pow_matrix(int[][] m, int power) {
        int[][] pow = m;
        if (m.length != m[0].length){
            System.out.println("!!!!!ошибка!!!!!");
        }
        else {
            int p = 1;
            while (p < power) {
                pow = mul_by_matrix(pow, m);
                p++;
            }
        }
        return pow;
    }

    //транспортированная матрица
    public int[][] transp_matrix(int[][] m){
        int[][] transp = new int [m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                transp[j][i] = m[i][j] ;
            }
        }
        return transp;

    }
}
