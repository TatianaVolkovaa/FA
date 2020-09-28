package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Vector vector1 = new Vector(2,4,3);
	    Vector vector2 = new Vector(1,2,3);
        System.out.println("length of 1 vector -> " + vector1.length_vec());
        System.out.println("length of 2 vector -> " + vector2.length_vec());
        System.out.println("scalar multiplication -> " + vector1.scalar_mul(vector2));
        System.out.print("vector multiplication -> ");
        vector1.vector_mul(vector2).print_vector();
        System.out.println("cos of angle -> " + vector1.cos_angle(vector1, vector2));
        System.out.print("summa -> ");
        vector1.summ(vector2).print_vector();
        System.out.print("difference -> ");
        vector1.diff(vector2).print_vector();
        Scanner in = new Scanner(System.in);
        System.out.print("введите колво векторов, которые хотите видеть в массиве -> ");
        int N = in.nextInt();
        Vector [] array = get_array_of_vectors(N);
        for (int i =0; i < N; i++){
            array[i].print_vector();
        }
    }

    static Vector [] get_array_of_vectors(int N){
        Vector [] result = new Vector [N];
        for (int i = 0; i < N; i++){
            result[i] = new Vector((int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10));
        }
        return result;
    }
}
