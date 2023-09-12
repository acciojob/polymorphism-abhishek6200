package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int x = p.product(4,5);
        int y = p.product(4,5,6);
        double z = p.product(4.5, 6.7);
        System.out.print(x+" "+y+" "+z);
    }

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

}