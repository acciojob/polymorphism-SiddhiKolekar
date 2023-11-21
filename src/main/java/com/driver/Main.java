package com.driver;

public class Main {

    public static class Product{
    public int Product(int x, int y){
        return (x*y);
    }
    public int Product(int x,int y, int z){
        return (x*y*z);
    }
    public double Product(double x, double y){
        return (x*y);
    }
    }
    public static void main(String args[]){
        Product p = new Product();

        //Task 3: create a method of following defination
        int ans = p.Product(10,20);
        System.out.println(ans);

        //Task 4: Create an Overload method product of following defination
        int ans1 = p.Product(10,20,30);
        System.out.println(ans1);

        //Task 5: Create an Overload method product of following defination
        double ans2 = p.Product(10.0,20.0);
        System.out.println(ans2);
    }
}