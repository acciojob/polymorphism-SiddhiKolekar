package com.driver;

public class Main {

   public static class Product{
        //Task 3: create a method of following defination public int product(int x, int y) {}
        public int product(int x, int y){
            return x*y;
        }
        //Task 4: create a Overloaded method product of following defination public int product(int x, int y, int z){}
        public int product(int x, int y, int z){
            return x*y*z;
        }
        //Task 5: create a Overloaded method product of following defination public double product(double x, double y){}
        public double product(double x, double y){
            return x*y;
        }

    }
    public static void main(String args[]){
        Product p = new Product();

        //Task 3: create a method of following defination
        int ans = p.Product(10,20);
       // System.out.println(ans);

        //Task 4: Create an Overload method product of following defination
        int ans1 = p.Product(10,20,30);
        //System.out.println(ans1);

        //Task 5: Create an Overload method product of following defination
        double ans2 = p.Product(1.0,2.0);
      //  System.out.println(ans2);

        System.out.println(ans+" "+ans1+" "+ans2);
    }
}
