package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //1
        System.out.println("hello world");
    //2
        int a = 5;
        System.out.println(a);
    //3
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a ++;
        System.out.println(a);
        int b = 1;
        a += b;
        System.out.println(a);
    //4
        System.out.println("a = " + a + "; b = " + b);
        int n = a;
        a = b;
        b = n;
        System.out.println("a = " + a + "; b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "; b = " + b);
        a *= b;
        b = a / b;
        a /= b;
        System.out.println("a = " + a + "; b = " + b);
        a = a + b - (b = a);
        System.out.println("a = " + a + "; b = " + b);
    //5
        a = 3;
        b = 4;
        int c = (int) Math.sqrt(a * a + b * b);
        System.out.println("катет a = " + a + "; катет b = " + b+ "; гипотенуза c = " + c);
    //6
        Scanner in = new Scanner(System.in);
        System.out.println("введите d -> ");
        int d = in.nextInt();
        //int d = 34567;
        System.out.println("последняя цифра -> " + d%10);
    //7
        int x = 234;
        System.out.printf("число -> %d; вторая справа цифра -> %d\n", x, x/10%10);
    //8
        int y = 87;
        System.out.printf("число -> %d; число десятков -> %d\n", y, y/10);
    //9
        //Scanner in = new Scanner(System.in);
        System.out.println("введите число чтобы найти разницу с 21 -> ");
        int num = in.nextInt();
        difference21(num);
        difference21(41);
        difference21(21);
        difference21(11);
    //10
        average(4,-6);
        average(3,9);
        average(2,5);
    //11
        geometrical_mean(4,6);
        geometrical_mean(16,9);
        geometrical_mean(2,-8);
    //12
        distance(-2.3,4,8.5,0.7);

    }
    static void difference21(int number) {
        int diff = Math.abs(number - 21);
        System.out.println("число -> " + number + "; разница -> " + diff);
    }

    static void average(double a, double b) {
        System.out.println("среднее арифметическое чисел " + a + " и " + b + " -> " + Math.abs((a + b) / 2));
    }

    static void geometrical_mean(int a, int b) {
        System.out.println("среднее геометрическое чисел " + a + " и " + b + " -> " + Math.sqrt(Math.abs(a * b)));
    }

    static void distance(double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(((x2 - x1) * (x2 - x1)) + (Math.pow((y2-y1),2)));
        System.out.println("точки: (" + x1 + "; " + y1 + ") и (" + x2 + "; " + y2 + ")");
        System.out.println("расстояние между точками -> " + dist);
    }
}
