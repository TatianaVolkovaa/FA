package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("высота матрицы A -> ");
		int row_a = in.nextInt();
		System.out.print("ширина матрицы A -> ");
		int col_a = in.nextInt();
		System.out.print("высота матрицы B -> ");
		int row_b = in.nextInt();
		System.out.print("ширина матрицы B -> ");
		int col_b = in.nextInt();
		System.out.print("число -> ");
		int n = in.nextInt();
		System.out.print("степень -> ");
		int s = in.nextInt();
		Matrix matrixA = new Matrix(row_a, col_a);
		Matrix matrixB = new Matrix(row_b, col_b);
		matrixA.random_matrix();
		matrixB.random_matrix();
		System.out.println(("матрица A - > "));
		print_matrix(matrixA.get_array());
		System.out.println(("матрица B - > "));
		print_matrix(matrixB.get_array());

		MatrixOps ops = new MatrixOps(matrixA.get_array(), matrixB.get_array());
		System.out.println("A + B -> ");
		print_matrix(ops.sum_matrix());
		System.out.println("A * n -> ");
		print_matrix(ops.mul_by_number(matrixA.get_array(), n));
		System.out.println("B * n -> ");
		print_matrix(ops.mul_by_number(matrixB.get_array(), n));
		System.out.println("A * B -> ");
		print_matrix(ops.mul_by_matrix(matrixA.get_array(), matrixB.get_array()));
		System.out.println("A ^ s -> ");
		print_matrix(ops.pow_matrix(matrixA.get_array(),s));
		System.out.println("B ^ s -> ");
		print_matrix(ops.pow_matrix(matrixB.get_array(),s));
		System.out.println("A ^ t -> ");
		print_matrix(ops.transp_matrix(matrixA.get_array()));
		System.out.println("B ^ t -> ");
		print_matrix(ops.transp_matrix(matrixB.get_array()));

	}

	//красиво выводит матрицу
	public static void print_matrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.format("%6d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
