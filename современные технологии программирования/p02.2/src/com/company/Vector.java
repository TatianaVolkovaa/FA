package com.company;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length_vec(){
        double result = Math.sqrt(x * x + y * y + z * z);
        return result;
        }

    public double scalar_mul(Vector v){
        double result = x * v.x + y * v.y + z * v.z;
        return result;
    }

    public Vector vector_mul(Vector v){
        double res_x = y * v.z - z * v.y;
        double res_y = z * v.x - x * v.z;
        double res_z = x * v.y - y * v.x;
        Vector result = new Vector(res_x, res_y, res_z);
        return result;
    }

    public double cos_angle(Vector v1, Vector v2){
        double result = v1.scalar_mul(v2) / Math.abs(v1.length_vec() * v2.length_vec());
        return result;
    }

    public Vector summ(Vector v){
        Vector result = new Vector(x + v.x,y + v.y,z + v.z);
        return result;
    }

    public Vector diff(Vector v){
        Vector result = new Vector(x - v.x,y - v.y,z - v.z);
        return result;
    }

    public void print_vector(){
        System.out.println("(" + x + "; " + y + "; " + z +")");
    }
}

